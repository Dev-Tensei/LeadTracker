package com.bignerdranch.android.lead

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import java.util.*

private const val TAG = "LeadFragment"
private const val ARG_LEAD_ID = "lead_id"

class LeadFragment : Fragment() {
    private lateinit var lead: Lead
    private lateinit var nameField: EditText
    private lateinit var phoneField: EditText
    private lateinit var preferenceField: EditText
    private lateinit var dateButton: Button
    private lateinit var contactedCheckBox: CheckBox
    private val leadDetailViewModel: LeadDetailViewModel by lazy {
        ViewModelProviders.of(this).get(LeadDetailViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lead = Lead()
        val leadId: UUID = arguments?.getSerializable(ARG_LEAD_ID) as UUID
        leadDetailViewModel.loadLead(leadId)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lead, container, false)

        nameField = view.findViewById(R.id.lead_name) as EditText
        phoneField = view.findViewById(R.id.lead_phone) as EditText
        preferenceField = view.findViewById(R.id.lead_preference) as EditText
        dateButton = view.findViewById(R.id.lead_date) as Button
        contactedCheckBox = view.findViewById(R.id.lead_contacted) as CheckBox


        dateButton.apply {
            text = lead.date.toString()
            isEnabled = false
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        leadDetailViewModel.leadLiveData.observe(
            viewLifecycleOwner,
            Observer { lead ->
                lead?.let {
                    this.lead = lead
                    updateUI()
                }
            })
    }

    override fun onStart() {
        super.onStart()

        val nameWatcher = object : TextWatcher {

            override fun beforeTextChanged(
                sequence: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {
                // This space intentionally left blank
            }

            override fun onTextChanged(
                sequence: CharSequence?,
                start: Int,
                before: Int,
                count: Int
            ) {
                lead.name = sequence.toString()
            }

            override fun afterTextChanged(sequence: Editable?) {
                // This one too
            }
        }

        nameField.addTextChangedListener(nameWatcher)

        val phoneWatcher = object : TextWatcher {

            override fun beforeTextChanged(
                    sequence: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
            ) {
                // This space intentionally left blank
            }

            override fun onTextChanged(
                    sequence: CharSequence?,
                    start: Int,
                    before: Int,
                    count: Int
            ) {
                lead.phone = sequence.toString()
            }

            override fun afterTextChanged(sequence: Editable?) {
                // This one too
            }
        }
        phoneField.addTextChangedListener(phoneWatcher)

        val preferenceWatcher = object : TextWatcher {

            override fun beforeTextChanged(
                    sequence: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
            ) {
                // This space intentionally left blank
            }

            override fun onTextChanged(
                    sequence: CharSequence?,
                    start: Int,
                    before: Int,
                    count: Int
            ) {
                lead.preference = sequence.toString()
            }

            override fun afterTextChanged(sequence: Editable?) {
                // This one too
            }
        }
        preferenceField.addTextChangedListener(preferenceWatcher)

        contactedCheckBox.apply {
            setOnCheckedChangeListener { _, isChecked ->
                lead.isContacted = isChecked
            }
        }
    }

    override fun onStop() {
        super.onStop()
        leadDetailViewModel.saveLead(lead)
    }

    private fun updateUI() {
        nameField.setText(lead.name)
        phoneField.setText(lead.phone)
        preferenceField.setText(lead.preference)
        dateButton.text = lead.date.toString()
        contactedCheckBox.apply {
            isChecked = lead.isContacted
            jumpDrawablesToCurrentState()
        }
    }

    companion object {

        fun newInstance(leadId: UUID): LeadFragment {
            val args = Bundle().apply {
                putSerializable(ARG_LEAD_ID, leadId)
            }
            return LeadFragment().apply {
                arguments = args
            }
        }
    }
}