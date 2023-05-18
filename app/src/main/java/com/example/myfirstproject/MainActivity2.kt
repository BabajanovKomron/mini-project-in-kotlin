package com.example.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val put = findViewById<TextView>(R.id.put);
        val put_2 = findViewById<TextView>(R.id.put2);
        var name = intent.getStringExtra("k_name")
        var surname = intent.getStringExtra("k_surname")
        var age = intent.getStringExtra("k_age")
        put_2.text = "$name $surname"
        put.text = "Тебе уже: $age"
    }

    fun return_button(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}