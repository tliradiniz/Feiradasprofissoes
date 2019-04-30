package com.example.kotlinlogin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.LinkMovementMethod
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_ads.*
import kotlinx.android.synthetic.main.activity_cc.*
import kotlinx.android.synthetic.main.activity_curso.*
import kotlinx.android.synthetic.main.activity_curso.view.*


class CursoCcActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cc)


        voltar_ec2.setOnClickListener {
            val intent = Intent(this, CursoActivity::class.java)
            startActivity(intent)

        }



    }
}