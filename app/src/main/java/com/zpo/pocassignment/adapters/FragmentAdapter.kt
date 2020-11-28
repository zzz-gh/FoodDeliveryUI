package com.zpo.pocassignment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.zpo.pocassignment.fragments.Intro1
import com.zpo.pocassignment.fragments.Intro2
import com.zpo.pocassignment.fragments.Intro3
import com.zpo.pocassignment.fragments.Intro4


class FragmentAdapter(fragmentActivity:FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return  4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> Intro1()
            1 -> Intro2()
            2 -> Intro3()
            else -> Intro4()
        }
    }
}