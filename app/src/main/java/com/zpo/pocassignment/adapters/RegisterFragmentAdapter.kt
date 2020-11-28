package com.zpo.pocassignment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.zpo.pocassignment.fragments.*


class RegisterFragmentAdapter(fragmentActivity:FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return  6
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> Register1()
            1 -> Register2()
            2 -> Register3()
            3 -> Register4()
            4 -> Register5()
            else -> Register6()
        }
    }
}