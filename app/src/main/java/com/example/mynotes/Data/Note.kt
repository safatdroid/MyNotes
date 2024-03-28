package com.example.mynotes.Data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Notes(
     @PrimaryKey(autoGenerate = true)
    val id : Int = 0 ,
    val title : String ,
    val disp : String ,
    val dateAdded : Long

)

