package com.bignerdranch.android.lead.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bignerdranch.android.lead.Lead

@Database(entities = [ Lead::class ], version=1)
@TypeConverters(LeadTypeConverters::class)
abstract class LeadDatabase : RoomDatabase() {
    abstract fun leadDao(): LeadDao
}