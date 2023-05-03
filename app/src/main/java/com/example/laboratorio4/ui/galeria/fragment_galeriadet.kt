package com.example.laboratorio4.ui.galeria

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.navigation.Navigation
import com.example.laboratorio4.R
import com.example.laboratorio4.databinding.FragmentGaleriadetBinding


class fragment_galeriadet : DialogFragment() {
    private var _binding:FragmentGaleriadetBinding?=null
    private val binding get()=_binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setStyle(DialogFragment.STYLE_NORMAL, R.style.DialogStyle)
        _binding= FragmentGaleriadetBinding.inflate(inflater, container,false)
       val root:View = binding.root
        //-----------
        val toolbar: Toolbar = _binding!!.tbGaleriaDet
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        toolbar.navigationIcon =  ContextCompat.getDrawable(requireActivity(), R.drawable.ic_left)
        toolbar.setTitle("Detalles del Arte")
        toolbar.setTitleTextColor(Color.WHITE)
        toolbar.setNavigationOnClickListener {
            dismiss()
            Navigation.findNavController(it).navigateUp()
        }
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)
    }


}