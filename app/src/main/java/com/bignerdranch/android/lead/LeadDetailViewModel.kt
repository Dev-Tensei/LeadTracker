package com.bignerdranch.android.lead

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.util.*

class LeadDetailViewModel() : ViewModel() {

    private val leadRepository = LeadRepository.get()
    private val leadIdLiveData = MutableLiveData<UUID>()

    var leadLiveData: LiveData<Lead?> =
        Transformations.switchMap(leadIdLiveData) { leadId ->
            leadRepository.getLead(leadId)
        }

    fun loadLead(leadId: UUID) {
        leadIdLiveData.value = leadId
    }

    fun saveLead(lead: Lead) {
        leadRepository.updateLead(lead)
    }
}