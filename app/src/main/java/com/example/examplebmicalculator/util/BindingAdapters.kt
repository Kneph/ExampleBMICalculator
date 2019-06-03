package com.example.examplebmicalculator.util

import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.examplebmicalculator.R

@BindingAdapter("app:textColor")
fun setTextColor(view: TextView, bmi: Double) {
    when {
        bmi > 25  -> view.setTextColor(ContextCompat.getColor(view.context, R.color.overweight))
        bmi > 18.5 -> view.setTextColor(ContextCompat.getColor(view.context, R.color.normal))
        bmi > 1 -> view.setTextColor(ContextCompat.getColor(view.context, R.color.underweight))
        else -> view.setTextColor(ContextCompat.getColor(view.context, R.color.primaryTextColor))
    }
}