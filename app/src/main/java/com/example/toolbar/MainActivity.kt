package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Show arrow icon
        supportActionBar?.title = "My app" // Cnange toolbar name
    }

    // Show custom toolbar with icons
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    // Arrow icon onClick Listener
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> finish()
            R.id.delete ->{
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()
            }
            R.id.save -> {
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
            }
            R.id.search -> {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
            }
            R.id.sync ->{
                Toast.makeText(this, "Sync", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}