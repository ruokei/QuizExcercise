package com.example.excercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.excercise.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var currentQuestion: Int = 0
    private var correctCount: Int = 0

    private val questionList: List<Question> = listOf(
        Question("Spider is a type of insect", true),
        Question("An insect has 8 legs", true),
        Question("Insects are food for many animal", true),
        Question("There are now more people on Earth than insect", false)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        displayQuestion(currentQuestion)

        binding.btnNext.setOnClickListener() {
            if(currentQuestion + 1 == questionList.size){

                var intent = Intent(this, ResultActivity::class.java)

                intent.putExtra("correctCount", correctCount)
                intent.putExtra("totalQuestion", questionList.size)

                startActivity(intent)

            }else {
                var selectId = binding.radioGroup.checkedRadioButtonId
                var currentQ = questionList[currentQuestion]

                var userAnswer = when(selectId){
                    R.id.radTrue -> true
                    else -> false
                }

                if(currentQ.answer == userAnswer){
                    correctCount++
                }

                currentQuestion++
                displayQuestion(currentQuestion)
            }
        }
        Log.i("main","onCreate")
    }

    fun displayQuestion(qNo: Int) {
        var question = questionList[qNo]

        binding.tvQuestion.text = question.question

    }

    override fun onStart() {
        super.onStart()
        Log.i("main","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("main","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("main","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("main","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("main","onDestroy")
    }
}