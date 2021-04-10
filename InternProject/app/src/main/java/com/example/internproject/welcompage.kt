package com.example.internproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcompage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcompage)
        val btn = findViewById<Button>(R.id.btncontinue)
        btn.setOnClickListener{
            startActivity(Intent(this,homepage::class.java))
        }
    }
}