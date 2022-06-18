package com.example.test.allTest

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.*
import com.example.test.R

class Test1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)

        val bTest = findViewById<Button>(R.id.buttonTestRez1)


        val vopros1 = findViewById<RadioButton>(R.id.radioButton2)
        val vopros2 = findViewById<RadioButton>(R.id.checkBox22)
        val vopros3 = findViewById<RadioButton>(R.id.checkBox33)
        val vopros4 = findViewById<RadioButton>(R.id.checkBox42)
        val vopros5 = findViewById<RadioButton>(R.id.checkBox53)

        bTest.setOnClickListener {
            var a:Int = 0

            if (vopros1.isChecked){
                a++
            }
            if (vopros2.isChecked){
                a++
            }
            if (vopros3.isChecked){
                a++
            }
            if (vopros4.isChecked){
                a++
            }
            if (vopros5.isChecked){
                a++
            }

            Toast.makeText(this, "Вы ответили правильно, на $a/5 вопросов", Toast.LENGTH_SHORT).show()

            val mySettings = "mysettings"
            val shaTest1 = "test1"
            val settings: SharedPreferences
            settings = getSharedPreferences(mySettings, Context.MODE_PRIVATE)
            val editor = settings.edit()

            //fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)

            editor.putString(shaTest1, a.toString())
            editor.apply()


        }
    }
}