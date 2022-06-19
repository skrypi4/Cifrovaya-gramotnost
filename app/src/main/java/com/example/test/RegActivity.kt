package com.example.test

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback



class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)



        val loginReg = findViewById<EditText>(R.id.username2)
        val passwordReg = findViewById<EditText>(R.id.password2)
        val passwordReg2 = findViewById<EditText>(R.id.password22)
        val reg = findViewById<TextView>(R.id.textView5)

       val vhod = findViewById<Button>(R.id.login2)

        reg.setOnClickListener {
            val intent = Intent(this@RegActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        val settings: SharedPreferences
        val mySettings = "mysettings"
        val token = "token"

        settings = getSharedPreferences(mySettings, Context.MODE_PRIVATE)
        var editor = settings.edit()

            //123
        vhod.setOnClickListener {
            if(passwordReg.text.toString().equals(passwordReg2.text.toString())){

            val service = ServiceBuilder.buildService(Service::class.java) //!!!!!!!!!!
            service.TokenResponse(UserFiles(loginReg.text.toString(), passwordReg.text.toString())).enqueue(object: Callback<Response<TokenResponse>> {
                override fun onResponse(
                    p0: Call<Response<TokenResponse>>,
                    p1: retrofit2.Response<Response<TokenResponse>>
                ) {
                    if (p1?.code() == 201) {

                        Toast.makeText(this@RegActivity, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show()

                        var tokenUser = p1.body()?.data?.token
                        editor.putString(token, tokenUser)
                        editor.apply()

                        val intent = Intent(this@RegActivity, Profile::class.java)
                        startActivity(intent)
                    }
                }

                override fun onFailure(p0: Call<Response<TokenResponse>>, p1: Throwable) {
                    Toast.makeText(this@RegActivity, "Вы уже зарегистрированны", Toast.LENGTH_SHORT).show()
                }


            } )
            } else{
                Toast.makeText(this, "Пароли не совпадают", Toast.LENGTH_SHORT).show()
            }
        }


        val testKnopka = findViewById<Button>(R.id.button34)
        val testText = findViewById<TextView>(R.id.textView27)
        testKnopka.setOnClickListener{
            testText.setText(settings.getString(token,"null"))
        }


    }
}
