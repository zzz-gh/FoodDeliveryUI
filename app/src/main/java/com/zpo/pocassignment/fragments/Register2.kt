package com.zpo.pocassignment.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.register1_fragment.view.*
import kotlinx.android.synthetic.main.register2_fragment.view.*

class Register2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val register2View =  inflater.inflate(R.layout.register2_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        register2View.btnSignUp.setOnClickListener {
            transaction.replace(R.id.llRegisterAllView,Register3(),null).addToBackStack(null).commit()

        }
        return  register2View
    }


}