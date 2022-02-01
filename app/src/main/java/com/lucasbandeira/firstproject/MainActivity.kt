package com.lucasbandeira.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("debug", "Hello, this is my log.")

        val sum1 = sum(5,9)
        val sum2 = sum (2,5,7)

        Log.i("MainAct", "sum" + sum1 + "" + sum2)

        val addButton = findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener {

            val num1Value: Int = Integer.parseInt(num1.text.toString())
            val num2Value: Int = Integer.parseInt(num2.text.toString())

            val sumValue: Int = sum(num1Value, num2Value)
            textView.text = sumValue.toString()
        }
    }
    fun sum(a: Int, b: Int): Int
    {
        return a + b
    }
    fun sum(a: Int, b: Int, c: Int): Int
    {
        return a + b + c
    }
}