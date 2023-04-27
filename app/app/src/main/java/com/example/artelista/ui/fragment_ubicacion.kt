package com.example.artelista.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import com.example.artelista.R
import com.example.artelista.databinding.FragmentUbicacionBinding


class fragment_ubicacion : Fragment() {

    private var fbinding:FragmentUbicacionBinding?=null
    private val binding get() = fbinding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fbinding = FragmentUbicacionBinding.inflate(inflater, container, false)
        val view: View = binding.root
        val img_mapa:ImageView = fbinding!!.imgMapa
        img_mapa.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.fragment_ubicaciondet)
        }
        return  view

    }

    override fun onDestroy() {
        super.onDestroy()
        fbinding = null
    }

}