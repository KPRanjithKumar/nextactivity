package com.example.nextactivity

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var sf : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        sf=getSharedPreferences("wdjan", MODE_PRIVATE)

        val view = findViewById<TextView>(R.id.textView2)

        val str = sf.getString("asmaa"," no data with this key")
        view.text = str
        Toast.makeText(applicationContext, str, Toast.LENGTH_SHORT).show()

    }
}