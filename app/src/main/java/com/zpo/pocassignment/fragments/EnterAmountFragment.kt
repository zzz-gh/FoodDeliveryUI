package com.zpo.pocassignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.enter_amount_fragment.view.*

class EnterAmountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val enterAmountFragmentView = inflater.inflate(R.layout.enter_amount_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        enterAmountFragmentView.topUpBtn.setOnClickListener {
            transaction.replace(R.id.llForEnterAmount,TopUpSuccessOneFragment(),null).addToBackStack(null).commit()
        }

        return  enterAmountFragmentView
    }


}