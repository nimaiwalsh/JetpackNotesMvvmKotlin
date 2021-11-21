package com.nims.jetpacknotesmvvmkotlin.note.notedetail.buildlogic

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.google.firebase.FirebaseApp
import com.nims.jetpacknotesmvvmkotlin.model.RoomNoteDatabase
import com.nims.jetpacknotesmvvmkotlin.model.implementations.NoteRepoImpl
import com.nims.jetpacknotesmvvmkotlin.model.repository.INoteRepository

class NoteDetailInjector(application: Application): AndroidViewModel(application) {

    private fun getNoteRepository(): INoteRepository {

        FirebaseApp.initializeApp(getApplication())
        return NoteRepoImpl(
            local = RoomNoteDatabase.getInstance(getApplication()).roomNoteDao()
        )
    }

    fun provideNoteViewModelFactory(): NoteViewModelFactory =
        NoteViewModelFactory(
            getNoteRepository()
        )

}