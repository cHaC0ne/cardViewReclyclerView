package com.example.cardviewinreclyverview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cardviewinreclyverview.Adapter.PerrosAdapter
import com.example.cardviewinreclyverview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        //Coloca cada item en una rejilla
        //val manager = GridLayoutManager(this, 2)
        val decoration = DividerItemDecoration(this, manager.orientation)
        b.rvPerros.layoutManager = manager
        b.rvPerros.addItemDecoration(decoration)
        b.rvPerros.layoutManager = LinearLayoutManager(this)
        b.rvPerros.adapter = PerrosAdapter(PerrosProvider.perrosList)

    }

}