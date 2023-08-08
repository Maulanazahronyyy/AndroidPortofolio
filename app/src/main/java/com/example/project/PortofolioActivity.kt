package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class PortofolioActivity : AppCompatActivity() {
    lateinit var portfolioView: RecyclerView
    lateinit var portofolioAdapter: PortofolioAdapter
    val listPortofolio = ArrayList<PortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)

        listPortofolio.add(
            PortofolioData(
            R.drawable.web, "AndroidPortofolio",
             "Project Latihan", "https://github/Maulanazahronyyy/AndroidPortofolio"
            )
        )
        listPortofolio.add(PortofolioData(
            R.drawable.web, "Ujian STS",
            "Ujian", "https://github/Maulanazahronyyy/Ujin-STS"
        ))
        listPortofolio.add(PortofolioData(
            R.drawable.web, "UPC",
            "Ambil paket ujian C", "https://github/Maulanazahronyyy/UPC"
        ))

        portfolioView = findViewById(R.id.rvportofolio)
        portfolioView.layoutManager = LinearLayoutManager(this)

        portofolioAdapter = PortofolioAdapter(listPortofolio)
        portofolioAdapter.notifyDataSetChanged()
        portfolioView.adapter = portofolioAdapter


    }
}