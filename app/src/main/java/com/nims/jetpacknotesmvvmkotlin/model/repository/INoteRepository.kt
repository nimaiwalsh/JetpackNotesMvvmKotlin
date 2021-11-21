package com.nims.jetpacknotesmvvmkotlin.model.repository

import com.nims.jetpacknotesmvvmkotlin.common.Result
import com.nims.jetpacknotesmvvmkotlin.model.Note

interface INoteRepository {
    suspend fun getNoteById(noteId: String): Result<Exception, Note>
    suspend fun getNotes(): Result<Exception, List<Note>>
    suspend fun deleteNote(note: Note): Result<Exception, Unit>
    suspend fun updateNote(note: Note): Result<Exception, Unit>
}