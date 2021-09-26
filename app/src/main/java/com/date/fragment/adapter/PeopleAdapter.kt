package com.date.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.date.R
import com.date.di.entity.People
import com.date.fragment.adapter.PeopleAdapter.Viewholder

class PeopleAdapter : RecyclerView.Adapter<Viewholder>() {
    private var peopleList =  ArrayList<People>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.fragment_people_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.onBind(peopleList[position])
    }

    override fun getItemCount(): Int {
        return peopleList.size
    }

    inner class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(people: People) {
           //create view
        }
    }
}

