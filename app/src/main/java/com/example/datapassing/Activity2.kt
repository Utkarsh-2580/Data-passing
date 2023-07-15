package com.example.datapassing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val activity_second_text : TextView = findViewById(R.id.activity_second_text)
        val receiveddata = intent.getStringExtra("key-activity")
        activity_second_text.setText(receiveddata)
    }
}