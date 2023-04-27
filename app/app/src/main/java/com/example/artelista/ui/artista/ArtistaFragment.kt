package com.example.artelista.ui.Artista

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.artelista.R

class ArtistaFragment : Fragment() {

    companion object {
        fun newInstance() = ArtistaFragment()
    }

    private lateinit var viewModel: ArtistaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_artista, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ArtistaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}