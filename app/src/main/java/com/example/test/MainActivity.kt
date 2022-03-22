package com.example.test

import android.media.Image
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<ListView>(R.id.list)
        val items: ArrayList<String> = ArrayList<String>()


        items.add("Раздел 1\n\nОсновы аппаратного и программного обеспечени")
        items.add("Раздел 2\n\nИнформационная грамотность\n" +
                "Получение информации")
        items.add("Раздел 3\n\nКоммуникация и сотрудничество" +
                "Интернет как коммуникативная среда. Цифровые инструменты и " +
                "сервисы для коммуникации и совместной деятельности. Онлайн-сервисы для организации видеоконференций и видеозвонков. \n" +
                "Мессенджеры")
        items.add("Раздел 4\n\nСоздание цифрового контента\n" +
                "Цифровой контент и его свойства")
        items.add("Раздел 5\n\nБезопасность в цифровом мире\n" +
                "Основы безопасного подключения к сети Интернет")



        val adapter = Adapter(items)
        list.adapter = adapter


    }

}