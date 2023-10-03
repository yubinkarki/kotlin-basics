package com.example.kotlinbasics.quiz

import com.example.kotlinbasics.R

object Constants {
    fun getQuestions(): ArrayList<QuestionModel> {
        val questionsList = ArrayList<QuestionModel>()

        val question1 = QuestionModel(
            1,
            "What country does the flag belong to?",
            R.drawable.ic_launcher_foreground,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )

        questionsList.add(question1)

        return questionsList
    }
}