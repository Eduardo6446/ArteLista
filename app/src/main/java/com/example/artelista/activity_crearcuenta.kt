package com.example.artelista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.artelista.databinding.ActivityCrearcuentaBinding

class activity_crearcuenta : AppCompatActivity() {
    //--------
    private lateinit var binding: ActivityCrearcuentaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ///-----
        binding = ActivityCrearcuentaBinding.inflate(layoutInflater)
        val view= binding.root
       setContentView(view)
        ///-----
        val toolbar:Toolbar = binding.tvCreaUnaAqui

        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("Crear Cuenta")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }


}