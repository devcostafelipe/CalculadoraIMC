package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.edtpeso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edtaltura)


        val Btncalcular = findViewById<Button>(R.id.btncalcular)

        Btncalcular.setOnClickListener {

            val peso = edtpeso.text
            val altura = edtaltura.text
            println("Cacular " + peso)
        }



    }
}