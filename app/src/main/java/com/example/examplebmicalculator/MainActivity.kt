package com.example.examplebmicalculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateBMI(v: View) {

        val heightEditText = findViewById<EditText>(R.id.etxt_height)
        val weightEditText = findViewById<EditText>(R.id.etxt_weight)
        val resultViev = findViewById<TextView>(R.id.txt_result)

        if (!heightEditText.text.toString().isNullOrEmpty() && !weightEditText.text.toString().isNullOrEmpty()) {

            val height = java.lang.Double.parseDouble(heightEditText.text.toString()) / 100
            val weight = java.lang.Double.parseDouble(weightEditText.text.toString())

            val bmi = weight / (height * height)
            resultViev.text = bmi.toString()
        }
    }
}