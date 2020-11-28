package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R

class DeliveryChatActivity : AppCompatActivity() {
    companion object{
        fun deliveryChatIntent(context: Context): Intent {
            return Intent(context,DeliveryChatActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery_chat)
    }
}