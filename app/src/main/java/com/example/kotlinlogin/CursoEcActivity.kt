package com.example.kotlinlogin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ads.*
import kotlinx.android.synthetic.main.activity_ec.*

class CursoEcActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ec)

        voltar_ec.setOnClickListener {
            val intent = Intent(this, CursoActivity::class.java)
            startActivity(intent)

        }
    }
}