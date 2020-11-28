package com.zpo.pocassignment.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.register3_fragment.view.*
import kotlinx.android.synthetic.main.register4_fragment.view.*

class Register4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val register4View = inflater.inflate(R.layout.register4_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        register4View.btnContinueR4.setOnClickListener {
            transaction.replace(R.id.llRegisterAllView,Register5(),null).addToBackStack(null).commit()

        }
        return register4View
    }


}