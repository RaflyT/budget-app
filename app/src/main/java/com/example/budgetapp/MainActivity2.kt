package com.example.budgetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.setOnNavigationItemSelectedListener (navListener)

        supportFragmentManager.beginTransaction().replace(R.id.flFragment, FirstFragment()).commit()
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