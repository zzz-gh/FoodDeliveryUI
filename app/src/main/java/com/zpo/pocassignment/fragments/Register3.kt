package com.zpo.pocassignment.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.register2_fragment.view.*
import kotlinx.android.synthetic.main.register3_fragment.view.*

class Register3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val register3View =  inflater.inflate(R.layout.register3_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        register3View.btnSendLink.setOnClickListener {
            transaction.replace(R.id.llRegisterAllView,Register4(),null).addToBackStack(null).commit()

        }
        return register3View
    }


}