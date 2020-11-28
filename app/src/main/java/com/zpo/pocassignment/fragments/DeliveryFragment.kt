package com.zpo.pocassignment.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.card_add_fragment.view.*
import kotlinx.android.synthetic.main.delivery_fragment.view.*

class DeliveryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val deliveryFragmentView = inflater.inflate(R.layout.delivery_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        deliveryFragmentView.btnContinue.setOnClickListener {
            transaction.replace(R.id.allDeliveryView,PaymentFragment(),null).addToBackStack(null).commit()
        }
        return deliveryFragmentView
    }


}