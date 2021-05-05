package com.bignerdranch.android.lead.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.bignerdranch.android.lead.Lead
import java.util.*

@Dao
interface LeadDao {
    @Query("SELECT * FROM lead")
    fun getLeads(): LiveData<List<Lead>>

    @Query("SELECT * FROM lead WHERE id=(:id)")
    fun getLead(id: UUID): LiveData<Lead?>

    @Update
    fun updateLead(lead: Lead)

    @Insert
    fun addLead(lead: Lead)
}