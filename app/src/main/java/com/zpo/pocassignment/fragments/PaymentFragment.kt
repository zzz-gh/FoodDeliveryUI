package com.zpo.pocassignment.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.zpo.pocassignment.R
import com.zpo.pocassignment.adapters.ListOrderAdapter
import com.zpo.pocassignment.adapters.ListOrderFullAdapter
import com.zpo.pocassignment.adapters.PaymentAdapter
import kotlinx.android.synthetic.main.card_add_fragment.view.*
import kotlinx.android.synthetic.main.payment_fragment.*
import kotlinx.android.synthetic.main.payment_fragment.view.*

class PaymentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val paymentFragmentView = inflater.inflate(R.layout.payment_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        paymentFragmentView.rvPaymentStyle.adapter = PaymentAdapter()
        paymentFragmentView.rvPaymentStyle.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        paymentFragmentView.btnCon.setOnClickListener {
            transaction.replace(R.id.allDeliveryView,OrderFragment(),null).addToBackStack(null).commit()
        }
        return paymentFragmentView
    }


}