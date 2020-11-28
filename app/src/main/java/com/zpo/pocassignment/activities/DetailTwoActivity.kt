package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.activity_detail_two.*

class DetailTwoActivity : AppCompatActivity() {
    companion object{
        fun detailTwoIntent(context: Context): Intent {
            return Intent(context, DetailTwoActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_two)

        addToCartD2.setOnClickListener {
            startActivity(CardActivity.cardActivityIntent(this))
        }
        rlCartDetails.setOnClickListener{
            startActivity(CardActivity.cardActivityIntent(this))
        }
    }
}