package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MyCalculator : AppCompatActivity() {
    lateinit var btnPLus:Button
    lateinit var btnSubtract:Button
    lateinit var btnModulus:Button
    lateinit var btnMultiply:Button
    lateinit var etNumber:EditText
    lateinit var etNumber2:EditText
    lateinit var tvStatus:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_calculator)

        btnModulus =findViewById(R.id.btnModulus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnPLus =findViewById(R.id.btnPlus)
        btnSubtract =findViewById(R.id.btnSubtract)
        etNumber =findViewById(R.id.etNumber)
        etNumber2 =findViewById(R.id.etNumber2)
        tvStatus =findViewById(R.id.tvStatus)

        btnModulus.setOnClickListener {
            var num1=etNumber.text.toString()
            var num2=etNumber2.text.toString()

            if(num1.isBlank()){
                etNumber.error="Number is required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumber2.error="Number is required"
                return@setOnClickListener
            }
            modulus(num1.toInt(),num2.toInt())
        }
        btnPLus.setOnClickListener {
            var num1=etNumber.text.toString()
            var num2=etNumber2.text.toString()

            if(num1.isBlank()){
                etNumber.error="Number is required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumber2.error="Number is required"
                return@setOnClickListener
            }
            add(num1.toInt(),num2.toInt())
        }
        btnMultiply.setOnClickListener {
            var num1=etNumber.text.toString()
            var num2=etNumber2.text.toString()

            if(num1.isBlank()){
                etNumber.error="Number is required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumber2.error="Number is required"
                return@setOnClickListener
            }
            multiply(num1.toInt(),num2.toInt())
        }
        btnSubtract.setOnClickListener {
            var num1=etNumber.text.toString()
            var num2=etNumber2.text.toString()

            if(num1.isBlank()){
                etNumber.error="Number is required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumber2.error="Number is required"
                return@setOnClickListener
            }
            subtract(num1.toInt(),num2.toInt())
        }

    }
    fun add(num1:Int,num2:Int){
        var sum=num1+num2
        tvStatus.text = "$sum"
    }
    fun subtract(num1:Int,num2:Int){
        var sub=num1-num2
        tvStatus.text = "$sub"
    }
    fun multiply(num1:Int,num2:Int){
        var mult=num1*num2
        tvStatus.text = "$mult"
    }
    fun modulus(num1:Int,num2:Int){
        var mod=num1%num2
        tvStatus.text = "$mod"
    }
}