package com.zpo.pocassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zpo.pocassignment.R
import com.zpo.pocassignment.viewHolder.Item1ViewHolder
import com.zpo.pocassignment.viewHolder.ItemFullViewHolder

class ListOrderFullAdapter:RecyclerView.Adapter<ItemFullViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemFullViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fullview_order_item,parent,false)
        return  ItemFullViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  9
    }

    override fun onBindViewHolder(holder: ItemFullViewHolder, position: Int) {

    }

}