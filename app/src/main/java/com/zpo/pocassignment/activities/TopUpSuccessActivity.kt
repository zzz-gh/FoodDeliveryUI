package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.activity_top_up_success.*

class TopUpSuccessActivity : AppCompatActivity() {
    companion object{
        fun topUpSuccessActivityIntent(context: Context): Intent {
            return Intent(context,TopUpSuccessActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_up_success)
        ivCloseBtn.setOnClickListener {
            startActivity(ReceiptActivity.receiptIntent(this))
        }
    }
}