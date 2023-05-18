package com.example.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.AbsSavedState
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    lateinit var name_input : TextView
    lateinit var surname_input : TextView
    lateinit var age_input : TextView

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name_input = findViewById(R.id.name_input);
        surname_input = findViewById(R.id.surname_input);
        age_input = findViewById(R.id.age_input);

    }
    fun OnClickButton(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("k_name","${name_input.text}")
        intent.putExtra("k_surname","${surname_input.text}")
        intent.putExtra("k_age","${age_input.text}")
        startActivity(intent)
    }


}