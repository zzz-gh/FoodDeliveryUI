package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.activity_rating.*

class RatingActivity : AppCompatActivity() {
    companion object{
        fun ratingActivityIntent(context: Context): Intent {
            return Intent(context,RatingActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        btnSubmit.setOnClickListener {
            startActivity(CompleteActivity.completeActivityIntent(this))
        }
    }
}