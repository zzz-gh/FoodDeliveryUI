package com.zpo.pocassignment.fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import com.zpo.pocassignment.activities.HomeActivity
import kotlinx.android.synthetic.main.register6_fragment.view.*

class Register6 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val register6View = inflater.inflate(R.layout.register6_fragment, container, false)
        register6View.btnAllowNotification.setOnClickListener {
            val intent =  Intent(context,HomeActivity::class.java)
            startActivity(intent)

        }
        return  register6View
    }


}