package com.zpo.pocassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zpo.adapterview.delegate.NewsItemActionDelegate
import com.zpo.pocassignment.R
import com.zpo.pocassignment.viewHolder.Item1ViewHolder
import com.zpo.pocassignment.viewHolder.PaymentViewHolder
import com.zpo.pocassignment.viewHolder.VisaViewHolder

class PaymentAdapter:RecyclerView.Adapter<PaymentViewHolder>(){
    private val VIEW_TYPE_VISA = 1
    private val VIEW_TYPE_PAYMENT = 2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentViewHolder {

        return when(viewType){
            VIEW_TYPE_VISA ->{
                val itemVIew = LayoutInflater.from(parent.context).inflate(R.layout.visa_item,parent,false)
                return  PaymentViewHolder((itemVIew))
            }
            VIEW_TYPE_PAYMENT ->{
                val itemVIew = LayoutInflater.from(parent.context).inflate(R.layout.paypal_item,parent,false)
                return  PaymentViewHolder((itemVIew))
            }
            else -> {
                val itemVIew = LayoutInflater.from(parent.context).inflate(R.layout.visa_item,parent,false)
                return  PaymentViewHolder((itemVIew))
            }
        }

    }

    override fun getItemCount(): Int {
        return  11
    }

    override fun onBindViewHolder(holder: PaymentViewHolder, position: Int) {

    }
    override fun getItemViewType(position: Int): Int {
        return when{
            position % 3 == 0 ->{
                VIEW_TYPE_VISA
            }
            else ->{
                VIEW_TYPE_PAYMENT

            }
        }
    }


}