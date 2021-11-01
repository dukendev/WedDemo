package com.ysanjeet535.weddemo_.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ysanjeet535.weddemo_.R
import com.ysanjeet535.weddemo_.data.AlphaNum

class AlphaNumAdapter(var alphaNums : List<AlphaNum>) : RecyclerView.Adapter<AlphaNumAdapter.AlphaNumViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlphaNumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return AlphaNumViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlphaNumViewHolder, position: Int) {
            holder.bind(alphaNums[position])
    }

    override fun getItemCount(): Int {
        return alphaNums.size
    }


    inner class AlphaNumViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        private val alphabetText: TextView= itemView.findViewById(R.id.alphabet)
        private val numberText : TextView = itemView.findViewById(R.id.number)


        fun bind(alphaNum : AlphaNum){
            alphabetText.text = alphaNum.alphabet
            numberText.text = alphaNum.number.toString()

        }
    }
}