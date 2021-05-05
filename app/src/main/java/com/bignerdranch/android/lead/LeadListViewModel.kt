package com.bignerdranch.android.lead

import androidx.lifecycle.ViewModel

class LeadListViewModel : ViewModel() {

    private val leadRepository = LeadRepository.get()
    val leadListLiveData = leadRepository.getLeads()

    fun addLead(lead: Lead) {
        leadRepository.addLead(lead)
    }

}