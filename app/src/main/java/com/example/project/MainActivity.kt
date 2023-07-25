package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val crdProfile = findViewById<CardView>(R.id.cardProfile)
        val crdPortofolio = findViewById<CardView>(R.id.cardPortofolio)
        val crdSkill = findViewById<CardView>(R.id.cardSkill)
        val crdHobby = findViewById<CardView>(R.id.cardHobby)
        val crdSchool = findViewById<CardView>(R.id.cardSchool)

        crdProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        crdPortofolio.setOnClickListener {
            val intent = Intent(this, PortofolioActivity::class.java)
            startActivity(intent)
        }
        crdSchool.setOnClickListener {
            val intent = Intent(this, SchoolActivity::class.java)
            startActivity(intent)
        }
        crdSkill.setOnClickListener {
            val intent = Intent(this, skillActivity::class.java)
            startActivity(intent)
        }
        crdHobby.setOnClickListener {
            val intent = Intent(this, HobbyActivity::class.java)
            startActivity(intent)
        }


    }
}