package com.zpo.pocassignment.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.card_add_fragment.view.*

class CardDestinationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val cardDesitinationFragmentView = inflater.inflate(R.layout.card_destination_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        return cardDesitinationFragmentView
    }


}