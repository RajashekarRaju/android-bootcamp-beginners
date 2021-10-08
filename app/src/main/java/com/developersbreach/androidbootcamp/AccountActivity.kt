package com.developersbreach.androidbootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val username = intent.getStringExtra("This contains name of the user")
        val email = intent.getStringExtra("This contains email of the user")

        Toast.makeText(applicationContext, username, Toast.LENGTH_LONG).show()

        val usernameTextView: TextView = findViewById(R.id.username_received)
        usernameTextView.text = email
    }
}