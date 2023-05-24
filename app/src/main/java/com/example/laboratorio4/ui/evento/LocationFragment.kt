package com.example.laboratorio4.ui.evento

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.navigation.Navigation
import com.example.laboratorio4.R
import com.example.laboratorio4.databinding.FragmentLocationBinding

//
class LocationFragment :DialogFragment(){


    private var _binding: FragmentLocationBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setStyle(DialogFragment.STYLE_NORMAL, R.style.DialogStyle)
        _binding= FragmentLocationBinding.inflate(inflater,container,false)
        val root: View=binding.root
        val img_map:ImageView=_binding!!.imgMap
        img_map.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.locationDetailsFragment)
        }
        //-----------
        val toolbar:Toolbar = _binding!!.tbUbicacion
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        toolbar.navigationIcon =  ContextCompat.getDrawable(requireActivity(), R.drawable.ic_left)
        toolbar.setTitle("Ubicacion")
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