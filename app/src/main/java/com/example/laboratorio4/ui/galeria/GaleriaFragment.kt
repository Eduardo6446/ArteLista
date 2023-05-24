package com.example.laboratorio4.ui.galeria

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio4.R
import com.example.laboratorio4.adapter.adaptergaleria
import com.example.laboratorio4.databinding.FragmentArteBinding
import com.example.laboratorio4.model.galeria

class GaleriaFragment : Fragment() {

    private var _binding: FragmentArteBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentArteBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //----
        val reciclerGaleria:RecyclerView=_binding!!.rvGaleria
        reciclerGaleria.layoutManager=LinearLayoutManager(context)
        //val adapterGaleria=adaptergaleria(getGaleria(), R.layout.item_galeria, Activity())
        //reciclerGaleria.adapter=adapterGaleria
        return root
    }

    /*fun getGaleria(): ArrayList<galeria> {
        val Galeria: ArrayList<galeria> = ArrayList<galeria>()
        //-------------
        Galeria.add(galeria("Henciel Daniel Bulimar", "1,600", "https://artelista.s3.amazonaws.com/obras/big/3/5/5/1209702-607458d7c0c2a.jpg", "Memories"))
        Galeria.add(galeria("Jesús Cuenca", "1,200", "https://artelista.s3.amazonaws.com/obras/big/1/6/4/1209582.jpg", "Memories"))
        Galeria.add(galeria("Pol Ledent", "1,600", "https://artelista.s3.amazonaws.com/obras/fichas/1/4/6/1209343.jpg", "Como en invierno"))
        Galeria.add(galeria("Maribel Flores", "1,600", "https://artelista.s3.amazonaws.com/obras/fichas/7/4/0/1208970.jpg", "Blossom"))
        Galeria.add(galeria("Nana Tchelidze", "575", "https://artelista.s3.amazonaws.com/obras/big/2/3/8/1245944.jpg", "El Puente"))
        return Galeria

    }*/

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}