package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zpo.pocassignment.R
import com.zpo.pocassignment.adapters.ListOrderFullAdapter
import com.zpo.pocassignment.adapters.VisaAdapter
import kotlinx.android.synthetic.main.activity_receipt.*
import kotlinx.android.synthetic.main.receipt_fragment.*

class ReceiptActivity : AppCompatActivity() {
    private lateinit var visaAdapter: ListOrderFullAdapter
    companion object{
        fun receiptIntent(context: Context): Intent {
            return Intent(context,ReceiptActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receipt)
        ivToHome.setOnClickListener {
            startActivity(HomeActivity.homeActivityIntent(this))
        }
//        rvReceipt.adapter = visaAdapter
//        rvReceipt.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
    }
}