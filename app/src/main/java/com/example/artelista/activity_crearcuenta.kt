package com.example.artelista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import com.example.artelista.databinding.ActivityCrearcuentaBinding

class activity_crearcuenta : AppCompatActivity() {
    private  lateinit var binding: ActivityCrearcuentaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrearcuentaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val toolbar: Toolbar = binding.tbCrearCuenta
        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("CREAR CUENTA")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }
}