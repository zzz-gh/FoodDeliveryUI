package com.zpo.pocassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zpo.adapterview.delegate.NewsItemActionDelegate
import com.zpo.pocassignment.R
import com.zpo.pocassignment.viewHolder.Item1ViewHolder
import com.zpo.pocassignment.viewHolder.SingleSmallIteamViewHolder

class SingleSmallItemAdapter(private val delegate: NewsItemActionDelegate):RecyclerView.Adapter<SingleSmallIteamViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleSmallIteamViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.single_small_item,parent,false)
        return SingleSmallIteamViewHolder(itemView,delegate)
    }

    override fun getItemCount(): Int {
        return  11
    }

    override fun onBindViewHolder(holder: SingleSmallIteamViewHolder, position: Int) {

    }


}