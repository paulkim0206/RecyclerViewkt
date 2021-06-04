package com.example.recyclerviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf<Profiles>(
            Profiles(R.drawable.man, "Paul", 35, "Sales Rep"),
            Profiles(R.drawable.man, "John", 44, "Sales Rep"),
            Profiles(R.drawable.man, "Mike", 33, "Sales Rep"),
            Profiles(R.drawable.woman, "Shelly", 31, "Sales Rep"),
            Profiles(R.drawable.woman, "Suzan", 55, "Sales Manager"),
            Profiles(R.drawable.man, "Paulo", 15, "Sales Rep"),
            Profiles(R.drawable.woman, "Emma", 31, "Sales Rep"),
            Profiles(R.drawable.woman, "Stone", 25, "Sales Rep"),
            Profiles(R.drawable.man, "Beom", 33, "Sales Rep"),
            Profiles(R.drawable.man, "Youn", 50, "Sales Manager"),
        )

        val rvProfile = findViewById<RecyclerView>(R.id.rv_profile)
        rvProfile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvProfile.setHasFixedSize(true)
        rvProfile.adapter = ProfileAdapter(profileList)

    }
}