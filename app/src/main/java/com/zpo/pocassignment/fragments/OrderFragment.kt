package com.zpo.pocassignment.fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import com.zpo.pocassignment.activities.FeelingActivity
import com.zpo.pocassignment.activities.HomeActivity
import com.zpo.pocassignment.activities.RatingActivity
import kotlinx.android.synthetic.main.card_add_fragment.view.*
import kotlinx.android.synthetic.main.order_fragment.view.*

class OrderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val orderFragmentView = inflater.inflate(R.layout.order_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        orderFragmentView.btnCheckOutOut.setOnClickListener {
            val intent =  Intent(context, FeelingActivity::class.java)
            startActivity(intent)
        }
        return orderFragmentView
    }


}