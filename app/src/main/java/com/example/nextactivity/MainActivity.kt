package com.example.nextactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var location: EditText
    lateinit var go: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.Name)
        location = findViewById(R.id.Location)
        go = findViewById(R.id.go)

        go.setOnClickListener{
            val str = "${name.text.toString()+"\n" + location.text.toString()}"

            val intent = Intent(this ,MainActivity2::class.java)
            intent.putExtra("send",str)
            startActivity(intent)

        }

    }
}