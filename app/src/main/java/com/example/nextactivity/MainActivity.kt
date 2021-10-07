package com.example.nextactivity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.Sampler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var location: EditText
    lateinit var go: Button

    lateinit var sf :SharedPreferences
    lateinit var editr :SharedPreferences.Editor


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.Name)
        location = findViewById(R.id.Location)
        go = findViewById(R.id.go)


        sf=getSharedPreferences("wdjan", MODE_PRIVATE)
        editr=sf.edit()


        go.setOnClickListener {
            val str = "${name.text.toString() + "\n" + location.text.toString()}"

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("send", str)

            editr.putString("asmaa",str)
            editr.commit()

            startActivity(intent)

        }
    }
}