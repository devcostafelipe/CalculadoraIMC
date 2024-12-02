package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.edtpeso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edtaltura)


        val Btncalcular = findViewById<Button>(R.id.btncalcular)

        Btncalcular.setOnClickListener {

            val pesoStr: String = edtpeso.text.toString()
            val alturaStr: String = edtaltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                //mostrar mensagem para o usuário

                Snackbar.make(
                           edtpeso,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG



                ).show()

            } else {

                val peso = edtpeso.text.toString().toFloat()
                val altura = edtaltura.text.toString().toFloat()

                val alturaq2 = altura * altura
                val resultado = peso / alturaq2

                println("Cacular " + resultado)



            }


        }
    }
}