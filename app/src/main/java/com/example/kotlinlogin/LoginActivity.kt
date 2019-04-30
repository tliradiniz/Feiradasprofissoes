package com.example.kotlinlogin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import android.widget.Toast
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.AuthResult
import android.support.annotation.NonNull
import com.google.android.gms.tasks.OnCompleteListener
import android.R.attr.password
import android.app.Activity
import android.content.Intent
import android.support.v4.app.FragmentActivity
import android.util.Log



class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_button.setOnClickListener {
            val email = login_email.text.toString()
            val senha = login_senha.text.toString()


            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, senha)
                .addOnCompleteListener {
                    if (!it.isSuccessful) return@addOnCompleteListener

                    //Log.d("Login", "Successfully logged in: ${it.result.user.uid}")

                    val intent = Intent(this, CursoActivity::class.java)
                    startActivity(intent)
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Erro ao acessar a conta! Verifique seus dados.", Toast.LENGTH_SHORT).show()
                }
        }






            cadastrar_textview.setOnClickListener {

                val intent = Intent(this, RegistroActivity::class.java)
                startActivity(intent)
            }
        }

    }



