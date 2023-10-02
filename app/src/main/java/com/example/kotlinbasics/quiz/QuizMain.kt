package com.example.kotlinbasics.quiz

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinbasics.R

class QuizMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.quiz_home)

        val btnStart: Button = findViewById(R.id.btn_start)
        val inputName: Button = findViewById(R.id.input_name)

        btnStart.setOnClickListener {
            if (inputName.text.isNotEmpty()) {
                Toast.makeText(this, "Please enter name", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuizQuestionActivity::class.java)

                startActivity(intent)
                finish()
            }
        }
    }
}