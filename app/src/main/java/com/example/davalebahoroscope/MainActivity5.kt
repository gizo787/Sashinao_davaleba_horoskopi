package com.example.davalebahoroscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class MainActivity5 : AppCompatActivity() {

    private lateinit var ukan: Button
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        auth = FirebaseAuth.getInstance()
        ukan = findViewById(R.id.ukan)

        ukan.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            supportActionBar?.hide()
        }
    }
}