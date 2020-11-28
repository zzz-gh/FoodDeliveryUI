package com.zpo.pocassignment.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.zpo.adapterview.delegate.NewsItemActionDelegate

class SingleSmallIteamViewHolder(itemView:View,delegate: NewsItemActionDelegate):RecyclerView.ViewHolder(itemView) {
    init {
        itemView.setOnClickListener {
            delegate.onTapNew()
        }
    }
}