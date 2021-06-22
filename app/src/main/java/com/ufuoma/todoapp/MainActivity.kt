package com.ufuoma.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import java.net.PasswordAuthentication

val validusername = "admin"
val validpassword = "ädmin"
private lateinit var usernameinput: EditText
private lateinit var passwordinput: EditText
private lateinit var submitbutton: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameinput = findViewById(R.id.UsernameInput)
        passwordinput = findViewById(R.id.PasswordInput)
        submitbutton = findViewById(R.id.submitbutton)

        submitbutton.setOnClickListener {
            val username = usernameinput.text.toString()
            val password = passwordinput.text.toString()
            login(username, password)
        }

    }

    private fun login(username: String, password: String) {
        if(isvalidcredentials(username, password)){
            val intent: Intent =Intent(this,Homeactivity::class.java)
            intent.putExtra("name",username)
            startActivity(intent)

        }else{
            Toast.makeText(applicationContext,"something went wrong",Toast.LENGTH_SHORT).show()
        }

    }
        private fun isvalidcredentials(username: String, password: String): Boolean{
            if(username== validusername && password == validpassword)return true
            return false
    }
}