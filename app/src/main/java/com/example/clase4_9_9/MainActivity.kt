package com.example.clase4_9_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adulto1 = Adulto("Sofia", 26, "Estudiante", EstadoCivil.SOLTERO)
        Toast.makeText(this, adulto.obtenerNombre(), Toast.LENGTH_LONG).show()


    }
}