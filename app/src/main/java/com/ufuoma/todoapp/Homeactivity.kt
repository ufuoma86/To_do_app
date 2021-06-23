package com.ufuoma.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Homeactivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeactivity)

        usernameDisplay = findViewById(R.id.usernamedisplay)

        usernameDisplay.text ="Welcome, ${intent.getStringExtra("name")}"

        }

    }
}