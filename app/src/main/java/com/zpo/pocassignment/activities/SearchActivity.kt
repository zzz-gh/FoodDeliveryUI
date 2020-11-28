package com.zpo.pocassignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.zpo.adapterview.delegate.NewsItemActionDelegate
import com.zpo.pocassignment.R
import com.zpo.pocassignment.adapters.ListOrderAdapter
import com.zpo.pocassignment.adapters.ListOrderFullAdapter
import com.zpo.pocassignment.fragments.DetailOne
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity(), NewsItemActionDelegate {
    private lateinit var listAdapter: ListOrderAdapter
    private lateinit var fullViewAdapter: ListOrderFullAdapter
    companion object{
        fun searchIntent(context: Context): Intent {
            return Intent(context,SearchActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        listAdapter = ListOrderAdapter(this)
        fullViewAdapter = ListOrderFullAdapter()
        rvListOrder.adapter = listAdapter
        rvListOrder.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        horizontalListOrder.adapter = fullViewAdapter
        horizontalListOrder.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        tvPopularSeeAll.setOnClickListener {
            startActivity(PopularSearch.popularIntent(this))
        }
    }
    override fun onTapNew() {
        startActivity(DetailOneActivity.detailIntent(this))
    }
}