package com.example.kotlinlogin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ads.*

class CursoAdsActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ads)

        voltar_ads.setOnClickListener {
            val intent = Intent(this, CursoActivity::class.java)
            startActivity(intent)

        }
        saiba_mais.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)

        }

    }


}