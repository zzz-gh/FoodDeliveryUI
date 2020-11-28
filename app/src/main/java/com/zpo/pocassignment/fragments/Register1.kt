package com.zpo.pocassignment.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.register1_fragment.view.*

class Register1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val register1View =  inflater.inflate(R.layout.register1_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        register1View.btnSignIn.setOnClickListener {
            transaction.replace(R.id.llRegisterAllView,Register2(),null).addToBackStack(null).commit()

        }
        return register1View

    }


}