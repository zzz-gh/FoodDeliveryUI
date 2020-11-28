package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import com.zpo.pocassignment.fragments.EnterAmountFragment
import com.zpo.pocassignment.fragments.ProfileFragment

class ProfileActivity : AppCompatActivity() {
    companion object{
        fun profileActivityIntent(context: Context): Intent {
            return Intent(context,ProfileActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.llForAllProfileFragment, ProfileFragment()).commit()
    }
}