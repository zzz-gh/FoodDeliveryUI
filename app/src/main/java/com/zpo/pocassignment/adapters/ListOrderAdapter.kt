package com.zpo.pocassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zpo.adapterview.delegate.NewsItemActionDelegate
import com.zpo.pocassignment.R
import com.zpo.pocassignment.viewHolder.Item1ViewHolder

class ListOrderAdapter(private val delegate: NewsItemActionDelegate):RecyclerView.Adapter<Item1ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Item1ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.order_item,parent,false)
        return Item1ViewHolder(itemView,delegate)
    }

    override fun getItemCount(): Int {
        return 7
    }

    override fun onBindViewHolder(holder: Item1ViewHolder, position: Int) {


    }
}