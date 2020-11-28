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
import kotlinx.android.synthetic.main.card_add_fragment.view.*
import kotlinx.android.synthetic.main.profile_fragment.view.*

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val profileFragmentView = inflater.inflate(R.layout.profile_fragment, container, false)
        val transaction = parentFragmentManager.beginTransaction()
        profileFragmentView.llMessage.setOnClickListener {
            transaction.replace(R.id.llForAllProfileFragment,MessageFragment(),null).addToBackStack(null).commit()
        }
        profileFragmentView.llWishList.setOnClickListener {
            transaction.replace(R.id.llForAllProfileFragment,WishListFragment(),null).addToBackStack(null).commit()
        }
        profileFragmentView.rlPpToShopping.setOnClickListener{
            val intent = Intent(context,HomeActivity::class.java)
            startActivity(intent)
        }
        return profileFragmentView
    }


}