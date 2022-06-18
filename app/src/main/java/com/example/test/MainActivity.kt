package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<ListView>(R.id.list)
        val itemsRazdel: ArrayList<String> = ArrayList<String>()


        itemsRazdel.add("Тема №1\n\nТехника безопасности и организация рабочего места")
        itemsRazdel.add("Тема №2\n\nКак правильно работать с компьютером")
        itemsRazdel.add("Тема №3\n\nПочему так важно защищать глаза")
        itemsRazdel.add("Тема №4\n\nКомплексы упражнений для снятия усталости глаз")
        itemsRazdel.add("Тема №5\n\nКак уменьшить вредное влияние сидячего положения?")
        itemsRazdel.add("Тема №6\n\nУстройства компьютера")
        itemsRazdel.add("Тема №7\n\nРабота с компьютерной мышью")
        itemsRazdel.add("Тема №8\n\nРабота на ноутбуке без мыши")
        itemsRazdel.add("Тема №9\n\nЧто такое Windows")
        itemsRazdel.add("Тема №10\n\nЧто такое файлы и папки")
        itemsRazdel.add("Тема №11\n\nГорячие клавиши компьютера")
        itemsRazdel.add("Тема №12\n\nПоиск файлов")
        itemsRazdel.add("Тема №13\n\nРабота с текстом")
        itemsRazdel.add("Тема №14\n\nПоиск и замена текста")
        itemsRazdel.add("Тема №15\n\nФорматирование текста в текстовом редакторе")
        itemsRazdel.add("Тема №16\n\nЧто такое скриншот и как его сделать")


        val adapter = Adapter(itemsRazdel)
        list.adapter = adapter

        //нижнее меню
        //Лекция Тестирование Профиль

        val buttonLek = findViewById<FrameLayout>(R.id.menu1)
        val buttonTest = findViewById<FrameLayout>(R.id.menu2)
        val buttonProfile = findViewById<FrameLayout>(R.id.menu3)

        buttonLek.setOnClickListener {
            Toast.makeText(this, "Вы уже находитесь здесь :)", Toast.LENGTH_SHORT).show()
        }
        buttonTest.setOnClickListener {
            val intent = Intent(this@MainActivity, Listtest::class.java)
            startActivity(intent)
        }
        buttonProfile.setOnClickListener {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }

    }

}