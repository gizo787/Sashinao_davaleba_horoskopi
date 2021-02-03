package com.example.davalebahoroscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class OtherActivity : AppCompatActivity() {

    private lateinit var button12: Button
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        auth = FirebaseAuth.getInstance()
        button12 = findViewById(R.id.button12)
        button12.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        supportActionBar?.hide()


    }
}