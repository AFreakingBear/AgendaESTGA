package com.example.agenda

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.datastore.preferences.core.stringPreferencesKey

class MainActivity : AppCompatActivity() {
    lateinit var nome : EditText
    lateinit var pass : EditText
    lateinit var loginClick : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nome = findViewById(R.id.user_input)
        pass = findViewById(R.id.password_input)
        loginClick =findViewById(R.id.login_btn)

        loginClick.setOnClickListener {
            val username = nome.text.toString()
            val password = pass.text.toString()
            Log.i("Teste login","Nome : $username e palavrapass: $password")

            viewNoteDetail(username)
        }
    }
/* Esta função têm como parametro de entrada uma string(USERNAME), o valor intendido   */
  private suspend fun getUserData(){
      user.data.collect{ userData ->
          val username = usrData[stringPreferencesKey("username")]?:"nenhum"
          val password = usrData[stringPreferencesKey("password")]?:"nenhum"
          runOnUiThread{
              txtNAme.text = username
              txtPass.text = password
          }
      }
  }


}