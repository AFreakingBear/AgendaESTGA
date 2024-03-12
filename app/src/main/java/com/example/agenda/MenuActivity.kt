package com.example.agenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MenuActivity : AppCompatActivity() {

    lateinit var bt1 : Button
    lateinit var bt2 : Button
    lateinit var bt3 : Button
    lateinit var bt4 : Button
    lateinit var username : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)
        setupView()
    }


    private fun setupView(){
        bt1 = findViewById(R.id.button3)
        bt2 = findViewById(R.id.button4)
        bt3 = findViewById(R.id.button5)
        bt4 = findViewById(R.id.button6)
        username = findViewById(R.id.textView2)
        username.text = "bem-vindo ${intent.getStringExtra("username").toString()}"

    }
}