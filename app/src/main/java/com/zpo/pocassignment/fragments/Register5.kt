package com.zpo.pocassignment.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import kotlinx.android.synthetic.main.register4_fragment.view.*
import kotlinx.android.synthetic.main.register5_fragment.view.*

class Register5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val register5View =  inflater.inflate(R.layout.register5_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        register5View.btnContinueR5.setOnClickListener {
            transaction.replace(R.id.llRegisterAllView,Register6(),null).addToBackStack(null).commit()

        }
        return register5View
    }


}