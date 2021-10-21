package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto:TextView = findViewById(R.id.texto)

        texto.setText("Benvenidos a Android con Kotlin!")

        Log.i("HOLAMUNDO", "Este es un primer mensaje en consola")


    }
}