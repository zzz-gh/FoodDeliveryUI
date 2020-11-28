package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.activity_feeling.*

class FeelingActivity : AppCompatActivity() {
    companion object{
        fun feelingActivityIntent(context: Context): Intent {
            return Intent(context,FeelingActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feeling)

        tvSkip.setOnClickListener {
            startActivity(RatingActivity.ratingActivityIntent(this))
        }

        fBackToHome.setOnClickListener {
            startActivity(HomeActivity.homeActivityIntent(this))
        }
    }
}