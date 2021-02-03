package com.example.davalebahoroscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var signOutButton: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button9: Button
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()
        signOutButton = findViewById(R.id.signOutButton)
        button9 = findViewById(R.id.button9)
        button5 = findViewById(R.id.button5)
        button7 = findViewById(R.id.button7)
        button6 = findViewById(R.id.button6)

        button9.setOnClickListener {
            val intent = Intent(this, OtherActivity::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)

        }



        supportActionBar?.hide()


        signOutButton.setOnClickListener {
            signOut()


            }


    }
    private fun signOut(){
        auth.signOut()
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

}