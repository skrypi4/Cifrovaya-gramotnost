package com.example.test

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class Adapter(strings: ArrayList<String>): BaseAdapter(){

    var strings: ArrayList<String> = ArrayList<String>()
    init {
        this.strings = strings
    }

    override fun getCount(): Int {
        return strings.size
    }

    override fun getItem(position: Int): String? {
        return strings?.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var view: View? = null

        if(convertView == null){
            view = LayoutInflater.from(parent?.context).inflate(R.layout.list_item, parent, false)
        } else{
            view = convertView
        }

        val text = view?.findViewById<TextView>(R.id.textView2)
        text?.text = strings.get(position)


        text?.setOnClickListener {

            if (position == 0){
            }
               // Toast.makeText(parent?.context, "Нажатие засчитанно на $position раздел", Toast.LENGTH_SHORT).show()
        }



        return view
    }
}