package com.ysanjeet535.weddemo_.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ysanjeet535.weddemo_.R
import com.ysanjeet535.weddemo_.data.AlphaNum

class AlphaNumAdapter(var alphaNums : List<AlphaNum>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_HEADER : Int = 0
    private val TYPE_LIST : Int = 1

    override fun getItemViewType(position: Int): Int {
        if(position == 0)
            return TYPE_HEADER
        return TYPE_LIST
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == TYPE_HEADER)
        {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.header_row,parent,false)
            return ViewHolderHeader(view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return AlphaNumViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is AlphaNumViewHolder -> { holder.bind(alphaNums[position-1])}
            is ViewHolderHeader -> {}
        }
    }

    override fun getItemCount(): Int {
        return alphaNums.size + 1
    }


    inner class AlphaNumViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        private val alphabetText: TextView= itemView.findViewById(R.id.alphabet)
        private val numberText : TextView = itemView.findViewById(R.id.number)


        fun bind(alphaNum : AlphaNum){
            alphabetText.text = alphaNum.alphabet
            numberText.text = alphaNum.number.toString()

        }
    }

    inner class ViewHolderHeader(itemView : View) : RecyclerView.ViewHolder(itemView)

}