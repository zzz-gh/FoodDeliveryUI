package com.zpo.pocassignment.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.card_add_fragment.view.*

class WishListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val wishListFragmentView = inflater.inflate(R.layout.wish_lsit_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
//        cardAddFragmentView.btnSaveCard.setOnClickListener {
//            transaction.replace(R.id.topUpAllView,CardDestinationFragment(),null).addToBackStack(null).commit()
//        }
        return wishListFragmentView
    }


}