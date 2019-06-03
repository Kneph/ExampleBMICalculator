package com.example.examplebmicalculator

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.examplebmicalculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    fun calculateBMI(v: View) {

        if (binding.etxtHeight.text.toString().isNotEmpty() && binding.etxtWeight.text.toString().isNotEmpty()) {

            val height = binding.etxtHeight.text.toString().toDouble() / 100
            val weight = binding.etxtWeight.text.toString().toDouble()

            val bmi = String.format("%.2f", weight / (height * height)).toDouble()
            binding.txtResult.text = bmi.toString()
            binding.bmi = bmi

        } else {
            Toast.makeText(this, this.resources.getString(R.string.toast_not_found), Toast.LENGTH_LONG).show()
        }
    }
}