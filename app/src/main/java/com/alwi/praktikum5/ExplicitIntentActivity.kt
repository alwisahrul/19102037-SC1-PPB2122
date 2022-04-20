package com.alwi.praktikum5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ExplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)

        val tv_tampildata: TextView = findViewById(R.id.tv_ei_terima_data)
        val bundle = intent.extras
        val nama = intent.getStringExtra(name: "value_nama")
        val nomor = intent.getStringExtra (name: "value_nomor")
        tv_tampildata.setText("Nama = $nama, Nomor = $nomor")
    }
}