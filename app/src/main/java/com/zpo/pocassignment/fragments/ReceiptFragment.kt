package com.zpo.pocassignment.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.zpo.pocassignment.R
import com.zpo.pocassignment.adapters.VisaAdapter
import kotlinx.android.synthetic.main.card_add_fragment.view.*
import kotlinx.android.synthetic.main.receipt_fragment.*

class ReceiptFragment : Fragment() {
    private lateinit var visaAdapter:VisaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val receiptFragmentView = inflater.inflate(R.layout.receipt_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        rvVisaCard.adapter = visaAdapter
        rvVisaCard.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
//        cardAddFragmentView.btnSaveCard.setOnClickListener {
//            transaction.replace(R.id.topUpAllView,ReceiptFragment(),null).addToBackStack(null).commit()
//        }
        return receiptFragmentView
    }


}