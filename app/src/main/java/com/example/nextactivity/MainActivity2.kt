package com.example.nextactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val view = findViewById<TextView>(R.id.textView2)

        val str = intent.getStringExtra("send")
        view.text = str
        Toast.makeText(applicationContext, str, Toast.LENGTH_SHORT).show()

    }
}