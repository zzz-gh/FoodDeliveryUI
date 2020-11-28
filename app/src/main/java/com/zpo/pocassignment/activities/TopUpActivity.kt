package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import com.zpo.pocassignment.fragments.CardNotSetFragment

class TopUpActivity : AppCompatActivity() {
    companion object{
        fun topUpIntent(context: Context): Intent {
            return Intent(context,TopUpActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_up)

//        vpp.adapter = TopupAdapter(this)
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.topUpAllView,CardNotSetFragment()).commit()
    }
}