package com.example.kotlinbasics.quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinbasics.R

class QuizQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_home)

        val questionsList = Constants.getQuestions()
    }
}