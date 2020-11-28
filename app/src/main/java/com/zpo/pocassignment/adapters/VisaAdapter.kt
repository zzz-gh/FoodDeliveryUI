package com.zpo.pocassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zpo.adapterview.delegate.NewsItemActionDelegate
import com.zpo.pocassignment.R
import com.zpo.pocassignment.viewHolder.Item1ViewHolder
import com.zpo.pocassignment.viewHolder.VisaViewHolder

class VisaAdapter():RecyclerView.Adapter<VisaViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VisaViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.visacard_item,parent,false)
        return VisaViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  7
    }

    override fun onBindViewHolder(holder: VisaViewHolder, position: Int) {

    }

}