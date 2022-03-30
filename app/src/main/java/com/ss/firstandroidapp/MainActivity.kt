package com.ss.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ค้นหาตัวแปรจากฝั่ง xml เก็บลงตัวแปร
        var textId = findViewById<TextView>(R.id.textView)
        textId.text = "First Android App :)"

    }
}