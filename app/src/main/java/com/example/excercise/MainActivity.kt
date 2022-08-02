package com.example.excercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val questionList:List<Question> = listOf(
        Question("Spider is a type of insert",true),
        Question("An insert has 8 legs",true),
        Question("Inserts are food for many animal",true),
        Question("There are now more people on Earth than insect",false))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}