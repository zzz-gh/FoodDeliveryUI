package com.zpo.pocassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zpo.adapterview.delegate.NewsItemActionDelegate
import com.zpo.pocassignment.R
import com.zpo.pocassignment.viewHolder.ForYouViewHolder
import com.zpo.pocassignment.viewHolder.Item1ViewHolder

class ForYouAdapter():RecyclerView.Adapter<ForYouViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForYouViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.foryou_item,parent,false)
        return  ForYouViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  9
    }

    override fun onBindViewHolder(holder: ForYouViewHolder, position: Int) {

    }

}