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

class CardNotSetFragment : Fragment() {
    companion object{

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val cardNotSetFragmentView =  inflater.inflate(R.layout.card_not_set_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        cardNotSetFragmentView.llAddNewCart.setOnClickListener {
            transaction.replace(R.id.topUpAllView,CardAddFragment(),null).addToBackStack(null).commit()
        }
        return  cardNotSetFragmentView
    }


}