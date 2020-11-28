package com.zpo.pocassignment.fragments

import android.content.Context
import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.zpo.adapterview.delegate.NewsItemActionDelegate
import com.zpo.pocassignment.R
import com.zpo.pocassignment.activities.HomeActivity
import com.zpo.pocassignment.adapters.SingleSmallItemAdapter
import kotlinx.android.synthetic.main.activity_search.*
import kotlinx.android.synthetic.main.detail_one_fragment.view.*
import kotlinx.android.synthetic.main.register6_fragment.view.*

class DetailOne : Fragment() , NewsItemActionDelegate {
    private  lateinit var singleSmallItemAdapter:SingleSmallItemAdapter
    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,DetailOne::class.java)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val detailOneView = inflater.inflate(R.layout.detail_one_fragment, container, false)
        singleSmallItemAdapter = SingleSmallItemAdapter(this)
        detailOneView.rvSmallItem.adapter =singleSmallItemAdapter
        detailOneView.rvSmallItem.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        return  detailOneView
    }


}