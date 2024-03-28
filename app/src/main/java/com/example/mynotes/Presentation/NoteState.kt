package com.example.mynotes.Presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.mynotes.Data.Notes

class NoteState {
    val notes: List<Notes> = emptyList()
    val title: MutableState<String> = mutableStateOf("")
    val disp: MutableState<String> = mutableStateOf("")
}
