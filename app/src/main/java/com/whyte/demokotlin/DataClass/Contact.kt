package com.whyte.demokotlin.DataClass

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "Contact")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val name : String,
    val phone : String,
    val createdDate : Date,
    val isActive : Int
)
