package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.activity_expense_on.*
import kotlinx.android.synthetic.main.activity_popular_search.*

class ExpenseOnActivity : AppCompatActivity() {
    companion object{
        fun expenseOnActivityIntent(context: Context): Intent {
            return Intent(context,ExpenseOnActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense_on)
        llAddCard.setOnClickListener {
            startActivity(TopUpActivity.topUpIntent(this))
        }
        llTopUpAmount.setOnClickListener {
            startActivity(AmountEnterActivity.enterAmountIntent(this))
        }
    }
}