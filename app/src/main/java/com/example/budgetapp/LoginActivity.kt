package com.example.budgetapp

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var history: TextView
    val CUSTOM_PREF_NAME = "User_data"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        etUsername=findViewById(R.id.edt_username)
        etPassword=findViewById(R.id.edt_password)

        val bundle = intent.extras
        if (bundle != null){
            etUsername.setText(bundle.getString("username"))
            etPassword.setText(bundle.getString("password"))
        }
        ///btn_login.setOnClickListener(this)
    }
}