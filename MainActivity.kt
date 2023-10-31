package com.example.recyclerviewhw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList: Array<Int>
    lateinit var titleList:Array<String>

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.apple_airpods,
            R.drawable.laptop,
            R.drawable.samsung_galaxy_s23,
            R.drawable.iphone_15_pro_max_
        )
        titleList = arrayOf(
            "Наушники Apple AirPods Max",
            "Ноутбук HP Pavilion",
            "Samsung Galaxy S22 Ultra",
            "Apple iPhone 15 Pro Max"
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        dataList = arrayListOf<DataClass>()
        getData()
    }

    private fun getData(){
        for(i in imageList.indices){
            val dataClass = DataClass(imageList[i], titleList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter=AdapterClass(dataList)
    }
}
