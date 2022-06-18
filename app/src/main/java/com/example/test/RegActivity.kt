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

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        val login = findViewById<EditText>(R.id.username2)
        val password = findViewById<EditText>(R.id.password2)
        val password2 = findViewById<EditText>(R.id.password22)
        val reg = findViewById<TextView>(R.id.textView5)

       val vhod = findViewById<Button>(R.id.login2)

        reg.setOnClickListener {
            val intent = Intent(this@RegActivity, LoginActivity::class.java)
            startActivity(intent)
        }

//        vhod.setOnClickListener {
//            val intent = Intent(this@RegActivity, Profile::class.java)
//            startActivity(intent)
//        }

            //123
//        vhod.setOnClickListener {
//            val service = ServiceBuilder.buildService(Service::class.java) //!!!!!!!!!!
//            service.logIn(login.text.toString(), password.text.toString()).enqueue(object: Callback<Response<TokenResponse>> {
//                override fun onResponse(
//                    p0: Call<Response<TokenResponse>>?,
//                    p1: retrofit2.Response<Response<TokenResponse>>?
//                ) {
//                    if (p1?.code() == 200) {
//                        Toast.makeText(this@RegActivity, "Вход прошел успешно", Toast.LENGTH_LONG)
//                            .show()
//                    }
//                    if (p1?.code() != 200) {
//                        Toast.makeText(this@RegActivity, "Логин или пароль неверный", Toast.LENGTH_LONG)
//                            .show()
//                    }
//                }
//
//                override fun onFailure(p0: Call<Response<TokenResponse>>, p1: Throwable) {
//                    TODO("Not yet implemented")
//                }
//
//            } )
//        }


    }
}