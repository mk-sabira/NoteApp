package com.example.notes.feature_notes.domain.use_cases

data class NoteUseCases(
    val getNotes: GetNotesUseCase,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
) {

}