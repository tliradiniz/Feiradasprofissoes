package com.example.kotlinlogin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_web.*

class WebViewActivity: AppCompatActivity() {
    var check =0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        if(intent.component.className.contentEquals("CursoAdsActivity")){
            check = 1
        }
        if(check==1){
             webview.loadUrl("https://www.unifor.br/web/graduacao/analise-e-desenvolvimento-de-sistema")
        }

    }

}