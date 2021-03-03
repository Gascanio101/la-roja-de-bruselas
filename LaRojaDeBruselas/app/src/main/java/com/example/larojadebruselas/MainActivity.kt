package com.example.larojadebruselas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // We create a variable to store the mutable list of players.
        var teamPlayers = mutableListOf<Player>()

        // Adding elements (Players) of type "Player" to the list of players.
        teamPlayers.add(Player("Fito Toledano", 26, "Defender"))
        teamPlayers.add(Player("Fernan Alguacil", 31, "Defender"))
        teamPlayers.add(Player("Stefan Friedrichs", 2, "Midfielder"))
        teamPlayers.add(Player("Nicolás Barragán", 10, "Midfielder"))
        teamPlayers.add(Player("Bruno Rinaldi", 9, "Striker"))

        // Inflate the recyclerView into the mainActivity, setting it in a linearLayout, to display vertically
        players_recyclerView.layoutManager= LinearLayoutManager(this)

        // Fill the recyclerview cell with the information regarding the items shown in screen
        players_recyclerView.adapter=RecyclerPlayerAdapter(teamPlayers)

    }
}