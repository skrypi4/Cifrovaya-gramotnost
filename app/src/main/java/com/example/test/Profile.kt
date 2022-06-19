package com.example.test

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
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
        val textZag = findViewById<TextView>(R.id.textView9)
        val textOp = findViewById<TextView>(R.id.textView26)
        val fon = findViewById<ImageView>(R.id.imageView5)
        val ocenka = findViewById<TextView>(R.id.textView29)


        textZag.visibility = View.INVISIBLE
        textOp.visibility = View.INVISIBLE
        fon.visibility = View.INVISIBLE
        ocenka.visibility = View.INVISIBLE

        val settings: SharedPreferences
        val mySettings = "mysettings"
        var test1= "test1"
        settings = getSharedPreferences(mySettings, Context.MODE_PRIVATE)

        test1 = settings.getString(test1,"null").toString()

        ocenka.text = test1

        if (test1 != null) {
            textZag.visibility = View.VISIBLE
            textOp.visibility = View.VISIBLE
            fon.visibility = View.VISIBLE
            ocenka.visibility = View.VISIBLE
            }







    }

}
