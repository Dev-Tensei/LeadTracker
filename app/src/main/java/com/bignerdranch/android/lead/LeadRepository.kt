package com.bignerdranch.android.lead

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.bignerdranch.android.lead.database.LeadDatabase
import java.util.*
import java.util.concurrent.Executors

private const val DATABASE_NAME = "lead-database"

class LeadRepository private constructor(context: Context) {

    private val database : LeadDatabase = Room.databaseBuilder(
        context.applicationContext,
        LeadDatabase::class.java,
        DATABASE_NAME
    ).build()

    private val leadDao = database.leadDao()
    private val executor = Executors.newSingleThreadExecutor()

    fun getLeads(): LiveData<List<Lead>> = leadDao.getLeads()

    fun getLead(id: UUID): LiveData<Lead?> = leadDao.getLead(id)

    fun updateLead(lead: Lead) {
        executor.execute {
            leadDao.updateLead(lead)
        }
    }

    fun addLead(lead: Lead) {
        executor.execute {
            leadDao.addLead(lead)
        }
    }

    companion object {
        private var INSTANCE: LeadRepository? = null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = LeadRepository(context)
            }
        }

        fun get(): LeadRepository {
            return INSTANCE ?:
            throw IllegalStateException("LeadRepository must be initialized")
        }
    }
}