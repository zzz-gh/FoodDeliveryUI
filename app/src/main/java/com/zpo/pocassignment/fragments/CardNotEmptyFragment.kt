package com.zpo.pocassignment.fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.card_not_set_fragment.view.*

class CardNotEmptyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val cardNotEmptyFragmentView =  inflater.inflate(R.layout.card_not_empty_fragment, container, false)
//        val transaction = parentFragmentManager.beginTransaction()
//        cardNotEmptyFragmentView.llAddNewCart.setOnClickListener {
//            transaction.replace(R.id.topUpAllView,CardAddFragment(),null).addToBackStack(null).commit()
//        }
        return  cardNotEmptyFragmentView
    }


}