package com.bignerdranch.android.lead

import android.app.Application

class LeadIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        LeadRepository.initialize(this)
    }
}