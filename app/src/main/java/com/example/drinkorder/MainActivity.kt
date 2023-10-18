package com.example.drinkorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private val bt1_01_onclick = View.OnClickListener {
        var intent_p = Intent(this, MainActivity2::class.java)
        startActivity(intent_p)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt01 : Button = findViewById(R.id.button2)
        bt01.setOnClickListener(bt1_01_onclick)
        val drink_tv : TextView = findViewById(R.id.drink_tv)
        var drink_name = intent?.getBundleExtra("key")?.getString("drink_name")
        drink_tv.setText(drink_name)
        val ice_tv : TextView = findViewById(R.id.ice_tv)
        var ice = intent?.getBundleExtra("key")?.getString("ice")
        ice_tv.setText(ice)
        val sugar_tv : TextView = findViewById(R.id.sweet_tv)
        var sugar = intent?.getBundleExtra("key")?.getString("sugar")
        sugar_tv.setText(sugar)
    }

}