package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.activity_complete.*
import kotlinx.android.synthetic.main.bottom_sheet.*

class CompleteActivity : AppCompatActivity() {
    companion object{
        fun completeActivityIntent(context: Context): Intent {
            return Intent(context,CompleteActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete)

        ivBusBS.setOnClickListener {
            startActivity(DeliveryChatActivity.deliveryChatIntent(this))
        }
        cBackToHome.setOnClickListener {
            startActivity(HomeActivity.homeActivityIntent(this))
        }
    }
}