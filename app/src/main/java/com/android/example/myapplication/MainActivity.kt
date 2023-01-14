package com.android.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val impastiList= listOf(Impasti("pizza"),Impasti("frolla"), Impasti("crepes"),Impasti("pane"))





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<RecyclerView>(R.id.impasti_list)
        val adapter = ImpastiAdapter(impastiPar = impastiList)
        list.adapter =adapter
        list.layoutManager =LinearLayoutManager(this)
    }
}