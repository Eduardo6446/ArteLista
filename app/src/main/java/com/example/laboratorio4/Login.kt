package com.example.laboratorio4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.laboratorio4.databinding.ActivityCrearCuentaBinding
import com.example.laboratorio4.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private  lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        val btnIniciarSesion:Button= binding.btnLogin
        btnIniciarSesion.setOnClickListener { v ->
            val intent = Intent(v.context, activity_Menu::class.java)
            startActivity(intent)
        }
        val tvcrearCuenta: TextView=binding.registrar
        tvcrearCuenta.setOnClickListener{ v->
            val intent= Intent(v.context,activity_CrearCuenta::class.java)
            startActivity(intent)

        }
    }
}