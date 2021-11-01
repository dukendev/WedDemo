package com.ysanjeet535.weddemo_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.ysanjeet535.weddemo_.adapters.AlphaNumAdapter
import com.ysanjeet535.weddemo_.data.FakeRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alphanums = FakeRepository.getAlphaNumList().toList()
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = AlphaNumAdapter(alphanums)
    }
}