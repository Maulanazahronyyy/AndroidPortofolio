package com.example.project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class HobbyAdapter (private val list: ArrayList<HobbyData>):

    RecyclerView.Adapter<HobbyAdapter.HobbyViewHolder>() {
    class HobbyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val judul = itemView.findViewById<TextView>(R.id.NamaHobby)
        private val desc = itemView.findViewById<TextView>(R.id.deskripsiHobby)

        fun bind(get: HobbyData) {
            judul.text = get.judul
            desc.text = get.desc
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyAdapter.HobbyViewHolder {
        return HobbyAdapter.HobbyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.hobby_list, parent, false)
        )

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HobbyViewHolder, position: Int) {
        holder.bind(list[position])
    }
}
