package com.nims.jetpacknotesmvvmkotlin.note

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.nims.jetpacknotesmvvmkotlin.R

class NoteActivity : AppCompatActivity() {

    private lateinit var nav: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        nav = Navigation.findNavController(this, R.id.fragment_nav)
    }
}
