package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class HobbyActivity : AppCompatActivity() {

    lateinit var HobbyView: RecyclerView
    lateinit var HobbyAdapter: HobbyAdapter
    val listHobby = ArrayList<HobbyData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        listHobby.add(HobbyData(R.drawable.hobby, "Playing Game",
            ""
        )
        )
        listHobby.add(HobbyData(R.drawable.hobby, "Jogging",
            ""
        ))

        HobbyView = findViewById(R.id.rvHobby)
        HobbyView.layoutManager = LinearLayoutManager(this)

        HobbyAdapter = HobbyAdapter(listHobby)
        HobbyAdapter.notifyDataSetChanged()
        HobbyView.adapter = HobbyAdapter
    }
}