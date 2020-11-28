package com.zpo.pocassignment.fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpo.pocassignment.R
import com.zpo.pocassignment.activities.RegisterActivity
import kotlinx.android.synthetic.main.intro4_fragment.view.*

class Intro4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewIntro4 = inflater.inflate(R.layout.intro4_fragment, container, false)
        viewIntro4.btnStart.setOnClickListener {
            val intent = Intent(context,RegisterActivity::class.java)
            startActivity(intent)
        }
        return viewIntro4
    }


}