package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zpo.pocassignment.R
import com.zpo.pocassignment.adapters.ForYouAdapter
import kotlinx.android.synthetic.main.activity_popular_search.*

class PopularSearch : AppCompatActivity() {
    companion object{
        fun popularIntent(context: Context): Intent {
            return Intent(context,PopularSearch::class.java)
        }
    }
    private lateinit var adapter:ForYouAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popular_search)
        adapter = ForYouAdapter()
        rvForYou.adapter = adapter
        rvForYou.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        llTopUp.setOnClickListener {
            startActivity(ExpenseOnActivity.expenseOnActivityIntent(this))
        }
        ivBus.setOnClickListener {
            startActivity(DeliveryActivity.deliveryIntent(this))
        }
    }
}