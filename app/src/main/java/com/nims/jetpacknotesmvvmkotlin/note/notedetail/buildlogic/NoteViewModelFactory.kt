package com.nims.jetpacknotesmvvmkotlin.note.notedetail.buildlogic

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nims.jetpacknotesmvvmkotlin.model.repository.INoteRepository
import com.nims.jetpacknotesmvvmkotlin.note.NoteViewModel
import kotlinx.coroutines.Dispatchers

class NoteViewModelFactory(
    private val noteRepo: INoteRepository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return NoteViewModel(noteRepo, Dispatchers.Main) as T
    }

}