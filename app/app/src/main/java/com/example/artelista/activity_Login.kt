package com.example.artelista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.TextView
import com.example.artelista.databinding.ActivityCrearcuentaBinding
import com.example.artelista.databinding.ActivityLoginBinding

class activity_Login : AppCompatActivity() {
    //
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        //
        val btnIniciarSesion: Button = binding.btnLogin
        btnIniciarSesion.setOnClickListener({ v ->
            val intent = Intent(v.getContext(), activity_menu::class.java)
            startActivity(intent)
        })

        val tvCrearCuenta: TextView = findViewById(R.id.tvCreaUnaAqui)
        tvCrearCuenta.setOnClickListener({v->
            val intent = Intent(v.getContext(),activity_crearcuenta::class.java)
            startActivity(intent)

        })
    }

}