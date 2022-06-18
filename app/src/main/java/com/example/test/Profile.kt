package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val buttonLek = findViewById<FrameLayout>(R.id.menu1)
        val buttonTest = findViewById<FrameLayout>(R.id.menu2)
        val buttonProfile = findViewById<FrameLayout>(R.id.menu3)

        buttonLek.setOnClickListener {
            val intent = Intent(this@Profile, MainActivity::class.java)
            startActivity(intent)
        }
        buttonTest.setOnClickListener {
            val intent = Intent(this@Profile, Listtest::class.java)
            startActivity(intent)
        }
        buttonProfile.setOnClickListener {
            Toast.makeText(this, "Вы уже находитесь здесь :)", Toast.LENGTH_SHORT).show()
        }

//        var a: Int
//        login.text = settings.getString(myLogin, "")?.toEditable()

    }

}
