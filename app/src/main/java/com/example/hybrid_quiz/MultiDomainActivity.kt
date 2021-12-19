package com.example.hybrid_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_multi_domain.*

class MultiDomainActivity : AppCompatActivity() {
//    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_domain)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        button.setOnClickListener {
            val username = intent.getStringExtra(Constants.USER_NAME)
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            startActivity(intent)
//            finish()
        }
        button2.setOnClickListener {
            val username = intent.getStringExtra(Constants.USER_NAME)
            val intent = Intent(this, QuizQuestionsActivity2::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            startActivity(intent)
//            finish()
        }
        button3.setOnClickListener {
            val username = intent.getStringExtra(Constants.USER_NAME)
            val intent = Intent(this, QuizQuestionsActivity3::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            startActivity(intent)
//            finish()
        }
        button4.setOnClickListener {
            val username = intent.getStringExtra(Constants.USER_NAME)
            val intent = Intent(this, QuizQuestionsActivity4::class.java)
            intent.putExtra(Constants.USER_NAME, username)
            startActivity(intent)
//            finish()
        }

    }
}