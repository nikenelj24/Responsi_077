package com.example.responsi_077

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Makanan 1", "Mcd", R.drawable.mkn1))
        list.add(Model("Makanan 2", "Burger", R.drawable.mkn2))
        list.add(Model("Makanan 3", "Sandwich", R.drawable.mkn3))
        list.add(Model("Makanan 4", "Pasta", R.drawable.mkn4))
        list.add(Model("Makanan 5", "Sayur", R.drawable.mkn5))
        list.add(Model("Makanan 6", "Es krim", R.drawable.mkn6))
        list.add(Model("Makanan 7", "Telur", R.drawable.mkn7))
        list.add(Model("Makanan 8", "Kebab", R.drawable.mkn8))
        list.add(Model("Makanan 9", "Ayam", R.drawable.mkn9))
        list.add(Model("Makanan 10", "Ayam lalapan", R.drawable.mkn10))

        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 1 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 2 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 3 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 4 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 5 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 6 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 7 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 8 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
            if (position == 9 ){
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
        }


    }
}

