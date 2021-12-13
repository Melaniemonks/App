package com.example.newproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_start)
        val new_name = findViewById<androidx.appcompat.widget.AppCompatEditText>(R.id.et_name)
        button.setOnClickListener {
            if(new_name.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()

            }else{
                val intent = Intent(this, QuizQuestions::class.java)
                startActivity(intent)
                finish()
            }
        }

    }


}