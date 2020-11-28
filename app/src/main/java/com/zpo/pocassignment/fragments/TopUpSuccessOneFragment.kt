package com.zpo.pocassignment.fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import com.zpo.pocassignment.activities.HomeActivity
import kotlinx.android.synthetic.main.enter_amount_fragment.view.*
import kotlinx.android.synthetic.main.register6_fragment.view.*
import kotlinx.android.synthetic.main.topup_success_one_fragment.view.*

class TopUpSuccessOneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val topUpSuccessOneFragmentView = inflater.inflate(R.layout.topup_success_one_fragment, container, false)
        topUpSuccessOneFragmentView.btnBackToHome.setOnClickListener {
            val intent =  Intent(context,HomeActivity::class.java)
            startActivity(intent)

        }
        return  topUpSuccessOneFragmentView
    }


}