package com.example.hybrid_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_multi_domain.*

class MultiDomainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_domain)

        button.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
        }
    }
}