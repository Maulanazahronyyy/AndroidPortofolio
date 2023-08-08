package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class skillActivity : AppCompatActivity() {

    lateinit var SkillView: RecyclerView
    lateinit var SkillAdapter: SkillAdapter
    val listSkill = ArrayList<SkillData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        listSkill.add(SkillData(R.drawable.school, "Android development",
            ""
        )
        )
        listSkill.add(SkillData(R.drawable.school, "Web Desainer",
            ""
        ))

        SkillView = findViewById(R.id.rvskill)
        SkillView.layoutManager = LinearLayoutManager(this)

        SkillAdapter = SkillAdapter(listSkill)
        SkillAdapter.notifyDataSetChanged()
        SkillView.adapter = SkillAdapter
    }
}