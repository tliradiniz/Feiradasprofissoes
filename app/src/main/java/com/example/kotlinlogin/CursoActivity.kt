package com.example.kotlinlogin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_curso.*

class CursoActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curso)

        button_cc.setOnClickListener {
            val intent = Intent(this, CursoCcActivity::class.java)
            startActivity(intent)
        }

        button_ads.setOnClickListener {
            val intent = Intent(this, CursoAdsActivity::class.java)
            startActivity(intent)
        }

        button_ec.setOnClickListener {
            val intent = Intent(this, CursoEcActivity::class.java)
            startActivity(intent)
        }

        button_eca.setOnClickListener {
            val intent = Intent(this, CursoEcaActivity::class.java)
            startActivity(intent)
        }

        button_sorteio.setOnClickListener {
            val intent = Intent(this, SorteioActivity::class.java)
            startActivity(intent)
        }




    }
}