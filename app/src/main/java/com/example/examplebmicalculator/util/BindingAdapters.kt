package com.example.examplebmicalculator.util

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.examplebmicalculator.R

@BindingAdapter("app:textColor")
fun setTextColor(view: TextView, bmi: Double) {
    when {
        bmi > 25  -> view.setTextColor(view.context.resources.getColor(R.color.overweight))
        bmi > 18.5 -> view.setTextColor(view.context.resources.getColor(R.color.normal))
        bmi > 1 -> view.setTextColor(view.context.resources.getColor(R.color.underweight))
        else -> view.setTextColor(view.context.resources.getColor(R.color.primaryTextColor))
    }
}