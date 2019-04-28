package com.example.kotlinlogin

import android.content.Intent
import android.gesture.GestureLibrary
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        registro_button.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            val email = email_edittext.text.toString()
            val senha = password_edittext.text.toString()

            if(email.isEmpty() || senha.isEmpty()) {
                Toast.makeText(this, "Insira um E-mail e Senha!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            performRegistre()
            saveStatus()
            startActivity(intent)
        }

        contaCriada_textview.setOnClickListener {

            finish()

//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
        }

    }
        private fun performRegistre(){
            val email = email_edittext.text.toString()
            val senha = password_edittext.text.toString()

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, senha)
                .addOnCompleteListener {
                    if (!it.isSuccessful) return@addOnCompleteListener
                }
                .addOnFailureListener {
                    return@addOnFailureListener
                }
                .addOnFailureListener {
                    Log.d("Main", "Sem sucesso ao criar conta: ${it.message}")
                    Toast.makeText(this, "Sem sucesso ao criar conta: ${it.message}", Toast.LENGTH_SHORT).show()
                }


    }

    private fun saveStatus() {

        val usuario = username_edittext.text.toString().trim()
        val escola = escola_edittext.text.toString().trim()
        val tipoEscola = tipodeescola_edittext.text.toString().trim()
        val cidade = cidade_edittext.text.toString().trim()
        val ref = FirebaseDatabase.getInstance(). getReference("resultado")
        val statusCadastro = ref.push().key
        val status = Status(statusCadastro!!, usuario, escola, tipoEscola, cidade)

        ref.child(statusCadastro).setValue(status).addOnCompleteListener {
            Toast.makeText(applicationContext, "Salvo", Toast.LENGTH_SHORT).show()
        }
    }

}

class Status(val id: String, val usuario: String, val escola: String, val tipoEscola: String, val cidade: String)




