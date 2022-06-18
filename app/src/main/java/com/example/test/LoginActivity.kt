package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login1 = findViewById<EditText>(R.id.username1)
        val password1 = findViewById<EditText>(R.id.password1)
        val reg = findViewById<TextView>(R.id.textView4)
        val vhod = findViewById<Button>(R.id.login)




        reg.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegActivity::class.java)
            startActivity(intent)
        }

        vhod.setOnClickListener {
            val intent = Intent(this@LoginActivity, Profile::class.java)
            startActivity(intent)
        }



        vhod.setOnClickListener {
            val service = ServiceBuilder.buildService(Service::class.java) //!!!!!!!!!!
            service.logIn(login1.text.toString(), password1.text.toString()).enqueue(object:Callback<Response<TokenResponse>>{
                override fun onResponse(
                    p0: Call<Response<TokenResponse>>?,
                    p1: retrofit2.Response<Response<TokenResponse>>?
                ) {
                    if (p1?.code() == 200) {
                        Toast.makeText(this@LoginActivity, "Вход прошел успешно", Toast.LENGTH_LONG)
                            .show()
                    }
                    if (p1?.code() != 200) {
                        Toast.makeText(this@LoginActivity, "Логин или пароль неверный", Toast.LENGTH_LONG)
                            .show()
                    }
                }

                override fun onFailure(p0: Call<Response<TokenResponse>>, p1: Throwable) {
                    TODO("Not yet implemented")
                }

            } )
        }

    }
}