package com.example.project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class SkillAdapter(private val  list: ArrayList<SkillData>):

    RecyclerView.Adapter<SkillAdapter.SkillViewHolder>() {

    class SkillViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val keterang = itemView.findViewById<TextView>(R.id.Keterangan)
        private val descr = itemView.findViewById<TextView>(R.id.desc)

        fun bind(get: SkillData){
            keterang.text = get.keterangan
            descr.text = get.desc
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillViewHolder {
        return SkillViewHolder(
            LayoutInflater.from(parent.context)
            .inflate(R.layout.skill_list, parent, false))
    }

    override fun onBindViewHolder(holder: SkillViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}