package com.example.test.allTest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.test.R

class Test1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)

        val bTest = findViewById<Button>(R.id.buttonTestRez1)

        val itemstest: ArrayList<String> = ArrayList<String>()

        bTest.setOnClickListener {
            Toast.makeText(this, "123", Toast.LENGTH_SHORT).show()

            val imageTest1 = findViewById<ImageView>(R.id.imageView5)
            val textTest1 = findViewById<TextView>(R.id.textView9)

            imageTest1.visibility = View.VISIBLE
            textTest1.visibility = View.VISIBLE
            //bTest.visibility = View.INVISIBLE
        }
    }
}