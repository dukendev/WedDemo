package com.ysanjeet535.weddemo_.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ysanjeet535.weddemo_.R

class HeaderAdapter : RecyclerView.Adapter<HeaderAdapter.HeaderViewHolder>() {


    inner class HeaderViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.header_row,parent,false)
        return HeaderViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return 1
    }
}