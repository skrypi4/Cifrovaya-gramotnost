package com.example.test.allTest

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.*
import com.example.test.Listtest
import com.example.test.Profile
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

        val settings: SharedPreferences
        val mySettings = "mysettings"
        val test1 = "test1"

        settings = getSharedPreferences(mySettings, Context.MODE_PRIVATE)
        var editor = settings.edit()

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


            var test1Profile = a.toString()
            editor.putString(test1, test1Profile)
            editor.apply()

            Toast.makeText(this, "Вы ответили правильно, на $a/5 вопросов", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@Test1, Listtest::class.java)
            startActivity(intent)
        }
    }
}