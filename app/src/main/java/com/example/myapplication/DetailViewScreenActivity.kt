package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailViewScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_view_screen)
         val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            setContentView(R.layout.activity_main_screen)
        }

    }
}