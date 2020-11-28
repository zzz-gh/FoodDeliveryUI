package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import com.zpo.pocassignment.fragments.CardNotSetFragment
import com.zpo.pocassignment.fragments.DeliveryFragment

class DeliveryActivity : AppCompatActivity() {
    companion object{
        fun deliveryIntent(context: Context): Intent {
            return Intent(context,DeliveryActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery)

        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.allDeliveryView, DeliveryFragment()).commit()
    }
}