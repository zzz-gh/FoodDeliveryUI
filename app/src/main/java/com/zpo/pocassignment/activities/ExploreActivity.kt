package com.zpo.pocassignment.activities

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.activity_detail_one.*
import kotlinx.android.synthetic.main.activity_explore.*
import kotlinx.android.synthetic.main.activity_home.*

class ExploreActivity : AppCompatActivity() {
    companion object{
        fun exploreIntent(context: Context): Intent {
            return Intent(context,ExploreActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)
        llAddCart.setOnClickListener {
            startActivity(CardActivity.cardActivityIntent(this))
        }

    }
}