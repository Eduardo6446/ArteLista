package com.example.artelista.ui.artista

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.artelista.R

class fragmentArtista : Fragment() {
    companion object {
        fun newInstance() = fragmentArtista()
    }

    private lateinit var viewModel: FragmentArtistaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment_artista, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentArtistaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}