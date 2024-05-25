package com.sanchez.aldo.usolayoutsv4

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sanchez.aldo.usolayoutsv4.databinding.ActivityRegistroBinding

class registroActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        observeComponents()
    }
    fun observeComponents() {
        binding.btnSave.setOnClickListener {
            if (isEmptyInputs()) {
                Toast.makeText(this, "Hay algún campo vacío", Toast.LENGTH_SHORT).show()
            } else {
                goDetallesActivity()
            }
        }
    }
    private fun goDetallesActivity() {
        val Nombre = binding.Nombre.text.toString()
        val Codigo= binding.Correo.text.toString()
        val Productos = binding.Celular.text.toString()
        val Direccion = binding.Direccion.text.toString()

        val intent = Intent(this, DetallesActivity::class.java)
        intent.putExtra(Nombre_key, Nombre)
        intent.putExtra(Celular_key, Codigo)
        intent.putExtra(Productos_key, Productos)
        intent.putExtra(Direccion_key, Direccion)
        startActivity(intent)

    }

    private fun isEmptyInputs(): Boolean {
        return binding.Nombre.text.isEmpty() ||
                binding.Correo.text.isEmpty() ||
                binding.Celular.text.isEmpty() ||
                binding.Direccion.text.isEmpty()

    }
}