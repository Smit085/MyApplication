package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout

class MainActivity : AppCompatActivity() {
    private var click:Int = 0
    private var colors = arrayOf("#00BCD4","8BC34A","#FFEB3B","9C27B0","#6CB027")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbars_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.action_color -> {
                click++
                click = click % 4
                var view: CoordinatorLayout = findViewById(R.id.constraint)
                when(click){
                    0 -> view.setBackgroundColor(getColor(R.color.orange))
                    1 -> view.setBackgroundColor(getColor(R.color.green))
                    2 -> view.setBackgroundColor(getColor(R.color.violet))
                    3 -> view.setBackgroundColor(getColor(R.color.cyan))
                    4 -> view.setBackgroundColor(getColor(R.color.yellow))
                }
                true
            }
            R.id.action_toast -> {
                Toast.makeText(this, "This is Toast Message", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}