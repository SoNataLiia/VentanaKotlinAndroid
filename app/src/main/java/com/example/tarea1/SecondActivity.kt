package com.example.tarea1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tarea1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nombre = intent.getStringExtra("NOMBRE") ?: ""
        val edad = intent.getStringExtra("EDAD") ?: ""

        binding.tvResultado.text = "Nombre: $nombre\nEdad: $edad años"
    }
}