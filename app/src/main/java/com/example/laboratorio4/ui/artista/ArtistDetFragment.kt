package com.example.laboratorio4.ui.artista

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.navigation.Navigation
import com.example.laboratorio4.R
import com.example.laboratorio4.databinding.FragmentArtistDetBinding


class ArtistDetFragment : DialogFragment() {

    private var _binding:FragmentArtistDetBinding?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setStyle(DialogFragment.STYLE_NORMAL, R.style.DialogStyle)
        _binding= FragmentArtistDetBinding.inflate(inflater,container,false)
        val root: View=binding.root
        //-----------
        val toolbar:Toolbar= _binding!!.tbArtistasDet
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        toolbar.navigationIcon =  ContextCompat.getDrawable(requireActivity(), R.drawable.ic_left)
        toolbar.setTitle("Datos del Artista")
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