package com.example.mynotes.Presentation

import com.example.mynotes.Data.Notes

sealed  interface NotesEvent {

    object SortNotes :  NotesEvent
    data class DeleteNote(var notes : Notes) : NotesEvent
    data class SaveNote(
        var title : String,
        var disp : String

    ) : NotesEvent


}