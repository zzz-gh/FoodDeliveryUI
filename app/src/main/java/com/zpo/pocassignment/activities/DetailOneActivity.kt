package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zpo.adapterview.delegate.NewsItemActionDelegate
import com.zpo.pocassignment.R
import com.zpo.pocassignment.adapters.SingleSmallItemAdapter
import com.zpo.pocassignment.fragments.DetailOne
import kotlinx.android.synthetic.main.activity_detail_one.*
import kotlinx.android.synthetic.main.detail_one_fragment.*
import kotlinx.android.synthetic.main.detail_one_fragment.view.*

class DetailOneActivity : AppCompatActivity(), NewsItemActionDelegate {
    companion object{
        fun detailIntent(context: Context): Intent {
            return Intent(context, DetailOneActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_one)

        rvSmallItemTT.adapter = SingleSmallItemAdapter(this)
        rvSmallItemTT.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        addToCart.setOnClickListener {
            startActivity(CardActivity.cardActivityIntent(this))
        }
    }
    override fun onTapNew() {
        startActivity(DetailTwoActivity.detailTwoIntent(this))
    }
}