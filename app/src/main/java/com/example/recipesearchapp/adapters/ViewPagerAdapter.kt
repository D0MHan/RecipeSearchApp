package com.example.recipesearchapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipesearchapp.R

class ViewPagerAdapter(val list : List<String>) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        return ViewPagerViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val text = list[position]
        val textView = holder.itemView.findViewById<TextView>(R.id.textTest)
        textView.text = text
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
