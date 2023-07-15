package com.example.datapassing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name_text : EditText = findViewById(R.id.name_text)
        val send_act_btn : Button = findViewById(R.id.send_act_btn)
        val send_frag_btn : Button = findViewById(R.id.send_frag_btn)



        ///Pass data between Activity to Frgament
        send_frag_btn.setOnClickListener{
            val value = name_text.text.toString()
            val fragmentvalue  = fragment1()
            val bundle = Bundle()
            bundle.putString("key",value)
            fragmentvalue.arguments = bundle
            supportFragmentManager.beginTransaction().add(R.id.framelayoutview,fragmentvalue).commit()
        }


        //pass data between Activity
        send_act_btn.setOnClickListener {
            val iactivity = Intent(this,Activity2::class.java)
            val valueactvity = name_text.text.toString()
            iactivity.putExtra("key-activity",valueactvity)
            startActivity(iactivity)

        }
    }
}