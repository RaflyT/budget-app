package com.example.budgetapp

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity




class PengeluaranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengeluaran)
        setContentView(R.layout.activity_pengeluaran)
        var spinnerLanguages = findViewById<Spinner>(R.id.spinner_jenis)


        val adapter = ArrayAdapter.createFromResource(this, R.array.Jenis, com.google.android.material.R.layout.support_simple_spinner_dropdown_item)
        adapter.setDropDownViewResource(androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item)
        spinnerLanguages.setAdapter(adapter);
    }


}