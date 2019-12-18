package com.study.vapinginfo

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvVapor: RecyclerView
    private var list:ArrayList<Vapor> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvVapor = findViewById(R.id.vpVaping)
        rvVapor.setHasFixedSize(true)

        list.addAll(VaporData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvVapor.layoutManager = LinearLayoutManager(this)
        val vaporAdapter = VaporAdapter(list, this)
        rvVapor.adapter = vaporAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_profile -> {
                val profileIntent = Intent(this, ProfileActivity::class.java)
                startActivity(profileIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
