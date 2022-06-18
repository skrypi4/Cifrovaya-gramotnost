package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page)

        val rnd = (0..5).shuffled().last()
        if(rnd == 4) {
            Toast.makeText(this, "Окно настроек открывается двойным нажатием", Toast.LENGTH_SHORT)
                .show()
        }

        val textPage = findViewById<TextView>(R.id.textView3)
        val scroll = findViewById<ScrollView>(R.id.ScrollView)

        val textSettings = findViewById<TextView>(R.id.textSettings)
        val buttonz = findViewById<Button>(R.id.button3)
        val bSredn = findViewById<Button>(R.id.button_sredn)
        val bMal = findViewById<Button>(R.id.button_mal)
        val bBol = findViewById<Button>(R.id.button_bolshoi)
        val viewSetting = findViewById<View>(R.id.settings)

        textSettings.visibility = View.INVISIBLE
        buttonz.visibility = View.INVISIBLE
        bSredn.visibility = View.INVISIBLE
        bMal.visibility = View.INVISIBLE
        bBol.visibility = View.INVISIBLE
        viewSetting.visibility = View.INVISIBLE

        //Анимация
        val mFadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein)
        val mFadeOut = AnimationUtils.loadAnimation(this, R.anim.fadeout)

        //Обработка двойного нажатия
            var doubleClick: Boolean? = false
        textPage.setOnClickListener {
            if (doubleClick!!) {
                textSettings.startAnimation(mFadeIn)
                buttonz.startAnimation(mFadeIn)
                bSredn.startAnimation(mFadeIn)
                bMal.startAnimation(mFadeIn)
                bBol.startAnimation(mFadeIn)
                viewSetting.startAnimation(mFadeIn)


                textSettings.visibility = View.VISIBLE
                buttonz.visibility = View.VISIBLE
                bSredn.visibility = View.VISIBLE
                bMal.visibility = View.VISIBLE
                bBol.visibility = View.VISIBLE
                viewSetting.visibility = View.VISIBLE
            }
            doubleClick = true

            Handler().postDelayed({ doubleClick = false }, 500)
        }

        buttonz.setOnClickListener {
            textSettings.startAnimation(mFadeOut)
            buttonz.startAnimation(mFadeOut)
            bSredn.startAnimation(mFadeOut)
            bMal.startAnimation(mFadeOut)
            bBol.startAnimation(mFadeOut)
            viewSetting.startAnimation(mFadeOut)

            textSettings.visibility = View.INVISIBLE
            buttonz.visibility = View.INVISIBLE
            bSredn.visibility = View.INVISIBLE
            bMal.visibility = View.INVISIBLE
            bBol.visibility = View.INVISIBLE
            viewSetting.visibility = View.INVISIBLE

        }

        //размер шрифта
         bMal.setOnClickListener {
             textPage.setTextSize(15F)
         }

        bSredn.setOnClickListener {
            textPage.setTextSize(22F)
        }

        bBol.setOnClickListener {
            textPage.setTextSize(40F)
        }




    }
}