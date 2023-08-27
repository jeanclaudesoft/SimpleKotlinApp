package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var goNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goNext = findViewById(R.id.goNext)
        goNext.setOnClickListener {
            //aller sur la seconde activity en une seule ligne
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))

            //ou declarer le intent (enleve le commentaire)
            //val intent = Intent(this@MainActivity, SecondActivity::class.java)
            //startActivity(intent)
        }
    }
}