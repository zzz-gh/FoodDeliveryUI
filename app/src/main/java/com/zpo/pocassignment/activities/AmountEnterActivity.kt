package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import com.zpo.pocassignment.fragments.CardNotSetFragment
import com.zpo.pocassignment.fragments.EnterAmountFragment

class AmountEnterActivity : AppCompatActivity() {
    companion object{
        fun enterAmountIntent(context: Context): Intent {
            return Intent(context,AmountEnterActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amount_enter)
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.llForEnterAmount, EnterAmountFragment()).commit()
    }
}