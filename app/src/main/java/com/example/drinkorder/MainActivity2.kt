package com.example.drinkorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private var ice :String = ""
    private var sugar : String = ""

    private val btn2_01_onclick = View.OnClickListener {
        var bundle = Bundle()
        val drink : EditText = findViewById(R.id.et_drink)
        var drink_name = drink.text.toString()
        bundle.putString("drink_name", drink_name)
        bundle.putString("ice", ice)
        bundle.putString("sugar", sugar)
        val reIntent = Intent(this, MainActivity::class.java)
        reIntent.putExtra("key", bundle)
        startActivity(reIntent)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val tv_test : TextView = findViewById(R.id.tv_test)

        val RG_01 : RadioGroup = findViewById(R.id.RG_01)
        val RG_02 : RadioGroup = findViewById(R.id.RG_02)
        RG_01.setOnCheckedChangeListener(){_,checkId->
            when(checkId){
                R.id.low_ice->{
                    ice = "微冰"
                }
                R.id.less_ice->{
                    ice = "少冰"
                }
                R.id.normal_ice->{
                    ice = "正常冰"
                }
            }
        }
        RG_02.setOnCheckedChangeListener(){ _, checkId->
            when(checkId){
                R.id.low_sugar->{
                    sugar = "微糖"
                }
                R.id.less_sugar->{
                    sugar = "少糖"
                }
                R.id.half_sugar->{
                    sugar = "半糖"
                }
                R.id.normal_sugar->{
                    sugar = "全糖"
                }
            }
        }
        tv_test.setText(ice)
        val submit_btn :Button = findViewById(R.id.submit_btn)
        submit_btn.setOnClickListener(btn2_01_onclick)

    }
}