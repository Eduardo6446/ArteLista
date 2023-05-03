package com.example.laboratorio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.laboratorio4.databinding.ActivityCrearCuentaBinding

class activity_CrearCuenta : AppCompatActivity() {
    private  lateinit var binding: ActivityCrearCuentaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCrearCuentaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //-------
        val toolbar:Toolbar= binding.tbCrearCuenta
        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("Create Account")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }
}