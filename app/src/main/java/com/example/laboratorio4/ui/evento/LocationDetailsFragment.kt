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
import com.example.laboratorio4.databinding.FragmentLocationDetailsBinding


class LocationDetailsFragment : DialogFragment() {

    private var _binding: FragmentLocationDetailsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setStyle(DialogFragment.STYLE_NORMAL, R.style.DialogStyle)
        _binding= FragmentLocationDetailsBinding.inflate(inflater,container,false)
        val root: View=binding.root
        //-----------
        val toolbar: Toolbar = _binding!!.tbUbicacionDet
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        toolbar.navigationIcon =  ContextCompat.getDrawable(requireActivity(), R.drawable.ic_left)
        toolbar.setTitle("Detalles de Ubicacion")
        toolbar.setTitleTextColor(Color.WHITE)
        toolbar.setNavigationOnClickListener {
            dismiss()
            Navigation.findNavController(it).navigateUp()
        }

        return root
    }


}