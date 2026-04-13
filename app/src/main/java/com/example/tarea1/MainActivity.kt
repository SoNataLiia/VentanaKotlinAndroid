package com.example.tarea1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tarea1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {
            val nombre = binding.etNombre.text.toString().trim()
            val edad = binding.etEdad.text.toString().trim()

            if (nombre.isEmpty() || edad.isEmpty()) {
                Snackbar.make(
                    binding.root,
                    "Por favor, rellena todos los campos",
                    Snackbar.LENGTH_SHORT
                ).show()
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("NOMBRE", nombre)
                intent.putExtra("EDAD", edad)
                startActivity(intent)
            }
        }
    }
}