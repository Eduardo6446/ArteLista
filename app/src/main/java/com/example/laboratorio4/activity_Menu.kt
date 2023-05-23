package com.example.laboratorio4

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.laboratorio4.databinding.ActivityMenuBinding

class activity_Menu : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        configNav()
    }
    protected fun configNav()
    {
        val bMenu:BottomNavigationView= binding.navView
        NavigationUI.setupWithNavController(bMenu,Navigation.findNavController(this,R.id.nav_host_fragment_activity_menu))
    }
}