package com.example.larojadebruselas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_cell.view.*

//Create Adapter class to link with the player's recyclerView
class RecyclerPlayerAdapter(var playerList:List<Player>): RecyclerView.Adapter<RecyclerPlayerAdapter.RecyclerPlayerViewHolder>() {

    // Create the viewHolder as an inner class for this Adapter alone
    class RecyclerPlayerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerPlayerViewHolder {

        // Inflates the recyclerView´s cell with the data from each item in the list
        return RecyclerPlayerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_cell,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerPlayerViewHolder, pos: Int) {

        // Assigns each view in the cell with its data
        holder.itemView.jerseyNumber.text=playerList.get(pos).jerseyNumber.toString()
        holder.itemView.playerName.text=playerList.get(pos).name
        holder.itemView.playerPosition.text=playerList.get(pos).position
    }

    override fun getItemCount(): Int {
        return playerList.size
    }
}