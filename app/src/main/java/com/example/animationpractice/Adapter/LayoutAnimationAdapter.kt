package com.example.animationpractice.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.animationpractice.R
import kotlinx.android.synthetic.main.item_layoutanimation.view.*

class LayoutAnimationAdapter : RecyclerView.Adapter<LayoutAnimationAdapter.LayoutAnimationViewHolder>(){

    private val sampleItems = generateSequence("A") { (it[0] +1).toString()  }.take(26).toList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LayoutAnimationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layoutanimation,parent,false)

        return LayoutAnimationViewHolder(view)
    }

    override fun getItemCount(): Int = sampleItems.size

    override fun onBindViewHolder(holder: LayoutAnimationViewHolder, position: Int) {
        holder.tv.text = sampleItems[position]
    }

    inner class LayoutAnimationViewHolder(v: View) : RecyclerView.ViewHolder(v){
        val tv = v.textView
    }
}