package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //UMA FORMA DE CRIAR OBJETOS:
        //val texto = TextView(this)
        //texto.text = "Hello world"
        //setContentView(texto)
    }
}