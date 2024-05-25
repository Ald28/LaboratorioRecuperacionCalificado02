package com.sanchez.aldo.usolayoutsv4

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio01 : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private var invisible = true

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01)

        imageView = findViewById(R.id.verde)

        val buttonMostrar = findViewById<Button>(R.id.mostrar)
        buttonMostrar.setOnClickListener {

            if (invisible) {
                imageView.visibility = View.VISIBLE
                invisible = false
            }
        }

        val buttonNoMostrar = findViewById<Button>(R.id.no_mostrar)
        buttonNoMostrar.setOnClickListener {
            imageView.visibility = View.INVISIBLE
            invisible = true
        }
    }
}