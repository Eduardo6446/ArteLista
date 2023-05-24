package com.example.laboratorio4.ui.artista

import android.app.Activity
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio4.R
import com.example.laboratorio4.adapter.adapterArtista
import com.example.laboratorio4.databinding.FragmentArtistaBinding
import com.example.laboratorio4.model.artista


class ArtistaFragment : Fragment() {

    private  var _binding:FragmentArtistaBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val artistaViewModel= ViewModelProvider(this).get(ArtistaViewModel::class.java)
        _binding= FragmentArtistaBinding.inflate(inflater, container, false)
        val root: View = binding.root
        //----
        val reciclerartista: RecyclerView =_binding!!.rvArtista
        reciclerartista.layoutManager= LinearLayoutManager(context)
        /*val adapterArtista= adapterArtista(getArtista(), R.layout.item_artista, Activity())
        reciclerartista.adapter=adapterArtista*/

        return root
        /*return inflater.inflate(R.layout.fragment_artista, container, false)*/
    }
/*    fun getArtista(): ArrayList<artista> {
        val artista: ArrayList<artista> = ArrayList<artista>()
        //-------------
        artista.add(artista("Armando Jose Aguirre", "Oil","Nicaragua"))
        artista.add(artista("German Traña Obando", "Pencil","Costa Rica" ))
        artista.add(artista("Pol Ledent", "Acrilic", "Panama"))
        artista.add(artista("Maribel Flores", "Oil","Nicaragua" ))
        artista.add(artista("Nana Tchelidze", "Canva","Guatemala" ))
        return artista

    }*/
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}