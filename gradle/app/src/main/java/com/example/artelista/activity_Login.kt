package com.example.artelista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.artelista.databinding.ActivityCrearcuentaBinding
import com.example.artelista.databinding.ActivityLoginBinding

class activity_Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val btnIniciar: Button = binding.btnLogin
        btnIniciar.setOnClickListener({ v ->
            val intent = Intent(v.getContext(), Activity_menu::class.java)
            startActivity(intent)
        })

        val tvCrear: TextView = binding.tvCreaUnaAqui
        tvCrear.setOnClickListener({ v ->
            val intent = Intent(v.getContext(), activity_crearcuenta::class.java)
            startActivity(intent)
        })
    }
}