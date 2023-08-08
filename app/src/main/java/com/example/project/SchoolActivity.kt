package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class SchoolActivity : AppCompatActivity() {
    lateinit var SchoolView: RecyclerView
    lateinit var SchoolAdapter: SchoolAdapter
    val listSchool = ArrayList<SchoolData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_school)

        listSchool.add(SchoolData(R.drawable.school, "SMK N 1 Sayung",
                "Onggorawe Sayung"
            )
        )
        listSchool.add(SchoolData(R.drawable.school, "MTsN 1 Demak",
            "Candisari"
        ))
        listSchool.add(SchoolData(R.drawable.school, "MI Miftahul Ulum Tegalarum",
        "Tegalarum, Ngaluran"))

        SchoolView = findViewById(R.id.rvschool)
        SchoolView.layoutManager = LinearLayoutManager(this)

        SchoolAdapter = SchoolAdapter(listSchool)
        SchoolAdapter.notifyDataSetChanged()
        SchoolView.adapter = SchoolAdapter


    }
}