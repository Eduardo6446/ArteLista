package com.example.artelista

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.artelista.R
import com.example.artelista.databinding.FragmentGaleriadetBinding


class fragment_galeriadet : Fragment() {

    private var fbinding: FragmentGaleriadetBinding? = null
    private val binding get() = fbinding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fbinding = FragmentGaleriadetBinding.inflate(inflater, container, false)
        val view : View =  binding.root
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        fbinding = null
    }
}