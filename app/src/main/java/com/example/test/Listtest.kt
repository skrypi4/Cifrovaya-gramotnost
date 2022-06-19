package com.example.test

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import com.example.test.allTest.Test1

class Listtest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listtest)



        val buttonLek = findViewById<FrameLayout>(R.id.menu1)
        val buttonTest = findViewById<FrameLayout>(R.id.menu2)
        val buttonProfile = findViewById<FrameLayout>(R.id.menu3)

        buttonLek.setOnClickListener {
            val intent = Intent(this@Listtest, MainActivity::class.java)
            startActivity(intent)
        }
        buttonTest.setOnClickListener {
            Toast.makeText(this, "Вы уже находитесь здесь :)", Toast.LENGTH_SHORT).show()
        }
        buttonProfile.setOnClickListener {
            val settings: SharedPreferences
            val mySettings = "mysettings"
            var token = "token"
            settings = getSharedPreferences(mySettings, Context.MODE_PRIVATE)

            token = settings.getString(token,"null").toString()


            if(token == "null"){
                val intent = Intent(this@Listtest, LoginActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this@Listtest, Profile::class.java)
                startActivity(intent)
            }
        }


        val test1 = findViewById<Button>(R.id.buttonTest1)

            test1.setOnClickListener {
            val intent = Intent(this@Listtest, Test1::class.java)
            startActivity(intent)
        }
    }
}