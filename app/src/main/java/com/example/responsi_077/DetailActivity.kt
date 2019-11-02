package com.example.responsi_077

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var listview = findViewById<ListView>(R.id.listView)


        listview.setOnItemClickListener() { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0 ){
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Ini merupakan makanan mcd", R.drawable.mkn1)
                startActivity(intent)
            }
            if (position == 1 ){
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Ini merupakan makanan burger", R.drawable.mkn2)
                startActivity(intent)
            }
            if (position == 2 ){
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Ini merupakan makanan sandwich", R.drawable.mkn3)
                startActivity(intent)
            }
            if (position == 3 ){
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Ini merupakan makanan pasta", R.drawable.mkn4)
                startActivity(intent)
            }
            if (position == 4 ){
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Ini merupakan makanan sayur", R.drawable.mkn5)
                startActivity(intent)
            }
            if (position == 5 ){
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Ini merupakan eskrim", R.drawable.mkn6)
                startActivity(intent)
            }
            if (position == 6 ){
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Ini merupakan makanan telur lengkap", R.drawable.mkn7)
                startActivity(intent)
            }
            if (position == 7 ){
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Ini merupakan makanan kebab", R.drawable.mkn8)
                startActivity(intent)
            }
            if (position == 8 ){
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Ini merupakan ayam dan kentang", R.drawable.mkn9)
                startActivity(intent)
            }
            if (position == 9 ){
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Ini merupakan makanan ayam lalapan", R.drawable.mkn10)
                startActivity(intent)
            }
        }


    }
}