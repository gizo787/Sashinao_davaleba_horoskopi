package com.example.davalebahoroscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class MainActivity6 : AppCompatActivity() {

    private lateinit var button66: Button
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        auth = FirebaseAuth.getInstance()
        button66 = findViewById(R.id.button66)


        button66.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        supportActionBar?.hide()

        }
    }
}