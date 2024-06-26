package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handler = Handler().postDelayed(Runnable {
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
        }, 2000)
    }
}