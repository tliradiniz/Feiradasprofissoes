package com.example.kotlinlogin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.view.View


class SorteioActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorteio)
    }

    fun goToIG(view: View) {
        goToUrl("https://www.instagram.com")
    }


    private fun goToUrl(url: String) {
        val uriUrl = Uri.parse(url)
        val launchBrowser = Intent(Intent.ACTION_VIEW, uriUrl)
        startActivity(launchBrowser)
    }
}