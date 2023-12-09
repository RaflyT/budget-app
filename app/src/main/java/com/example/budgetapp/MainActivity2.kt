package com.example.budgetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

import android.view.Menu
import android.view.MenuItem
import android.widget.Toast


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val actionBar = supportActionBar
        actionBar!!.title = "Action Bar"
        actionBar.subtitle = "a custom Action Bar"
        actionBar.setIcon(R.drawable.logo)
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.setOnNavigationItemSelectedListener (navListener)

        supportFragmentManager.beginTransaction().replace(R.id.flFragment, FirstFragment()).commit()
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.bottom_nav_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
            R.id.wallet -> Toast.makeText(this, "Wallet", Toast.LENGTH_SHORT).show()
            R.id.profile -> Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

    private val navListener = BottomNavigationView.OnNavigationItemSelectedListener {
        // By using switch we can easily get the
        // selected fragment by using there id
        lateinit var selectedFragment: Fragment
        when (it.itemId) {
            R.id.home -> {
                selectedFragment =HomeFragment()
            }
            R.id.wallet -> {
                selectedFragment = FirstFragment()
            }
            R.id.profile -> {
                selectedFragment = FirstFragment()
            }
            R.id.notif -> {
                selectedFragment = ReminderFragment()
            }
        }
        // It will help to replace the
        // one fragment to other.
        supportFragmentManager.beginTransaction().replace(R.id.flFragment, selectedFragment).commit()
        true
    }
}