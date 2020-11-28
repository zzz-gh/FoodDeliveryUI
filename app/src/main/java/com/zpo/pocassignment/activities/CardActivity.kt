package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zpo.adapterview.delegate.NewsItemActionDelegate
import com.zpo.pocassignment.R
import com.zpo.pocassignment.adapters.ListOrderAdapter
import kotlinx.android.synthetic.main.activity_card.*
import kotlinx.android.synthetic.main.activity_search.*

class CardActivity : AppCompatActivity() , NewsItemActionDelegate {
    private lateinit var listAdapter: ListOrderAdapter
    companion object{
        fun cardActivityIntent(context: Context): Intent {
            return Intent(context,CardActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        listAdapter = ListOrderAdapter(this)
        rvListCartOrder.adapter = listAdapter
        rvListCartOrder.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        btnCheckOut.setOnClickListener {
            startActivity(TopUpSuccessActivity.topUpSuccessActivityIntent(this))
        }

    }
}