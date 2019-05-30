package com.example.examplebmicalculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val heightEditText = findViewById<View>(R.id.etxt_height) as EditText
    val weightEditText = findViewById<View>(R.id.etxt_weight) as EditText
    val resultViev = findViewById<View>(R.id.txt_result) as TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateBMI(v: View) {

        if (!heightEditText.text.toString().isNullOrEmpty() && !weightEditText.text.toString().isNullOrEmpty()) {

            val height = java.lang.Double.parseDouble(heightEditText.text.toString()) / 100
            val weight = java.lang.Double.parseDouble(weightEditText.text.toString())

            val bmi = weight / (height * height)
            resultViev.text = bmi.toString()

        }
    }
}