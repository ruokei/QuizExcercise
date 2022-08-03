package com.example.excercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.excercise.databinding.ActivityMainBinding
import com.example.excercise.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding:ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_result)

        var correctCount = intent.getIntExtra("correctCount",0)
        var totalCount = intent.getIntExtra("totalQuestion",0)

        binding.tvScore.text = ((correctCount/totalCount.toDouble())*100).toString()+"%"


    }
}