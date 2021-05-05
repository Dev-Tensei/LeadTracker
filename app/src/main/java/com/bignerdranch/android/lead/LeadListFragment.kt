package com.bignerdranch.android.lead

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*


private const val TAG = "LeadListFragment"

class LeadListFragment : Fragment() {
    /**
     * Required interface for hosting activities
     */
    interface Callbacks {
        fun onLeadSelected(leadId: UUID)
    }

    private var callbacks: Callbacks? = null

    private lateinit var leadRecyclerView: RecyclerView
    private var adapter: LeadAdapter? = LeadAdapter(emptyList())

    private val leadListViewModel: LeadListViewModel by lazy {
        ViewModelProviders.of(this).get(LeadListViewModel::class.java)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        callbacks = context as Callbacks?
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lead_list, container, false)

        leadRecyclerView =
            view.findViewById(R.id.lead_recycler_view) as RecyclerView
        leadRecyclerView.layoutManager = LinearLayoutManager(context)
        leadRecyclerView.adapter = adapter
        return view
//        updateUI()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        leadListViewModel.leadListLiveData.observe(
            viewLifecycleOwner,
            Observer { leads ->
                leads?.let {
                    Log.i(TAG, "Got leads ${leads.size}")
                    updateUI(leads)
                }
            })
    }

    override fun onDetach() {
        super.onDetach()
        callbacks = null
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.fragment_lead_list, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.new_lead -> {
                val lead = Lead()
                leadListViewModel.addLead(lead)
                callbacks?.onLeadSelected(lead.id)
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun updateUI(leads: List<Lead>) {
        adapter = LeadAdapter(leads)
        leadRecyclerView.adapter = adapter
    }

    private inner class LeadHolder(view: View)
        : RecyclerView.ViewHolder(view), View.OnClickListener {

        private lateinit var lead: Lead

        val itemBackground: ConstraintLayout = itemView.findViewById((R.id.linearLayout))
        val titleTextView: TextView = itemView.findViewById(R.id.lead_name)
        val phoneTextView: TextView = itemView.findViewById(R.id.lead_phone)
//        val preferenceTextView: TextView = itemView.findViewById(R.id.lead_preference)
        val dateTextView: TextView = itemView.findViewById(R.id.lead_date)
        val callBtn: Button = itemView.findViewById(R.id.btnCall)
//        private val solvedImageView: ImageView = itemView.findViewById(R.id.lead_contacted)

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(lead: Lead) {
            this.lead = lead
            titleTextView.text = this.lead.name
            phoneTextView.text = this.lead.phone
            callBtn.text = this.lead.phone


            callBtn.setOnClickListener{
                val callIntent = Intent(Intent.ACTION_CALL)
                callIntent.data = Uri.parse("tel:+" + this.lead.phone)
                startActivity(callIntent)
            }


//            preferenceTextView.text = this.lead.preference
            dateTextView.text = this.lead.date.toString()
//            solvedImageView.visibility = if (lead.isContacted) {
//                View.VISIBLE
//            } else {
//                View.GONE
//            }
            if (lead.isContacted) {
                itemBackground.setBackgroundColor(Color.parseColor("#ABE7FF"));
                titleTextView.setTextColor(Color.parseColor("#FFFFFF"));
            }
        }



        override fun onClick(v: View) {
            callbacks?.onLeadSelected(lead.id)
        }
    }

    private inner class LeadAdapter(var leads: List<Lead>)
        : RecyclerView.Adapter<LeadHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
                : LeadHolder {
            val view = layoutInflater.inflate(R.layout.list_item_lead, parent, false)
            return LeadHolder(view)
        }

        override fun getItemCount() = leads.size

        override fun onBindViewHolder(holder: LeadHolder, position: Int) {
            val lead = leads[position]
            holder.bind(lead)
        }
    }

    companion object {
        fun newInstance(): LeadListFragment {
            return LeadListFragment()
        }
    }
}