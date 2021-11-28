package com.example.notes.feature_notes.domain.use_cases

import com.example.notes.feature_notes.domain.model.InvalidNoteException
import com.example.notes.feature_notes.domain.model.Note
import com.example.notes.feature_notes.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote (
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can not be empty. ")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can not be empty. ")
        }
        repository.insertNote(note)
    }
}