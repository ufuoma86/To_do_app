package com.ufuoma.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {

    private lateinit var homebutton: button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        homebutton = findViewById(R.id.homebutton)

        homebutton.setonclicklistener{
            val intent = intent(this, Homeactivity::class.java)
        }


    }
}