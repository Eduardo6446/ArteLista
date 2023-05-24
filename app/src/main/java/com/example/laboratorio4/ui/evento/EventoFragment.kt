package com.example.laboratorio4.ui.evento

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
import com.example.laboratorio4.adapter.adapterevento
import com.example.laboratorio4.adapter.adaptergaleria
import com.example.laboratorio4.databinding.FragmentEventosBinding
import com.example.laboratorio4.model.evento
import com.example.laboratorio4.model.galeria

class EventoFragment : Fragment() {

    private var _binding: FragmentEventosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentEventosBinding.inflate(inflater, container, false)
        val root: View = binding.root
        //----
        val reciclerevento: RecyclerView =_binding!!.rvEvento
        reciclerevento.layoutManager= LinearLayoutManager(context)
        //val adapterevento= adapterevento(getEventos(), R.layout.item_evento, Activity())
        //reciclerevento.adapter=adapterevento

        return root
    }
    /*fun getEventos(): ArrayList<evento> {
        val evento: ArrayList<evento> = ArrayList<evento>()
        //-------------
        evento.add(evento("Armando Jose Aguirre", "Oil","08:00"))
        evento.add(evento("German Traña Obando", "Lapiz","10:00" ))
        evento.add(evento("Pol Ledent", "Acrilico", "03:00"))
        evento.add(evento("Maribel Flores", "Oleo","11:00" ))
        evento.add(evento("Nana Tchelidze", "Canva","04:00" ))
        return evento

    }*/

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}