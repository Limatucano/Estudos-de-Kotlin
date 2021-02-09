package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn_login)
        var texto = findViewById<TextView>(R.id.textView)
        var count : Int = 0
        btn.setOnClickListener {
            count++
            texto.setText(count.toString())
        }
        //UMA FORMA DE CRIAR OBJETOS:
        //val texto = TextView(this)
        //texto.text = "Hello world"
        //setContentView(texto)
    }
}