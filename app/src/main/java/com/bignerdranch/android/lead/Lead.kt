package com.bignerdranch.android.lead

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Lead(@PrimaryKey val id: UUID = UUID.randomUUID(),
                 var name: String = "",
                 var phone: String = "",
                 var preference: String = "",
                 var date: Date = Date(),
                 var isContacted: Boolean = false)