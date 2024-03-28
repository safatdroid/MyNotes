package com.example.mynotes.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {



    @Upsert   //for use data delete and insert

    suspend fun upsertNote(note: Notes)


    @Delete
    suspend fun deleteNote(note: Notes)

    @Query("SELECT * FROM notes ORDER BY title ASC" )
     fun getOrderByTitle(): Flow<List<Notes>>


    @Query("SELECT * FROM notes ORDER BY dateAdded" )
    fun getOrderByDateAddedBy(): Flow<List<Notes>>

}