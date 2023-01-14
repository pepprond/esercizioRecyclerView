package com.android.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ImpastiViewHolder(view:View): RecyclerView.ViewHolder(view){
    val impastiName: TextView
        init {
            impastiName =view.findViewById(R.id.impasti_name)
        }

}
class ImpastiAdapter (val impastiPar: List<Impasti>):RecyclerView.Adapter<ImpastiViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImpastiViewHolder {
        val impastiView = LayoutInflater.from(parent.context).inflate(R.layout.impastilistitem,parent, false)
        return ImpastiViewHolder(impastiView)
    }

    override fun onBindViewHolder(holder: ImpastiViewHolder, position: Int) {
        holder.impastiName.text=impastiPar[position].name
    }

    override fun getItemCount(): Int {
        return impastiPar.size
    }
}