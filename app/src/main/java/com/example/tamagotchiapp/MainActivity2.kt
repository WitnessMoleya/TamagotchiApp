package com.example.tamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Code to link Activities using the Intent Class
        var btnFeed = findViewById<Button>(R.id.btnFeed)
        btnFeed.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        //Code to link Activities using the Intent Class
        var btnClean = findViewById<Button>(R.id.btnClean)
        btnClean.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        //Code to link Activities using the Intent Class
        var btnPlay = findViewById<Button>(R.id.btnPlay)
        btnPlay.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}