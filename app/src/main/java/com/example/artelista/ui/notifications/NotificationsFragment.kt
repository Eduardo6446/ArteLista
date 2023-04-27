package com.example.artelista.ui.notifications

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.artelista.R
import com.example.artelista.adapter.adapterevento
import com.example.artelista.databinding.FragmentNotificationsBinding
import com.example.artelista.model.evento


class NotificationsFragment : Fragment() {

    private var fbinding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = fbinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        /*val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)
        */
        fbinding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val view: View = binding.root

        //val textView: TextView = binding.textNotifications
       /* notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        val reciclerevento : RecyclerView = fbinding!!.rvEvento
        reciclerevento.layoutManager = LinearLayoutManager(context)
        val adapterevento = adapterevento(getEvento(), R.layout.item_evento, Activity())
        reciclerevento.adapter = adapterevento
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fbinding = null
    }

    fun getEvento(): ArrayList<evento> {
        //--------------
        val Evento: ArrayList<evento> = ArrayList<evento>()
        //-------------
        Evento.add(evento("Armando Jose Aguirre", "Oleo", "8:00"))
        Evento.add(evento("German Traña Obando", "Lapiz", "10:00"))
        Evento.add(evento("Pol Lendent", "Acrilico", "03:00"))
        Evento.add(evento("Maribel Flores", "Oleo", "11:00"))
        Evento.add(evento("Nana Tchelidze", "Canva", "04:00"))
        Evento.add(evento("Armando Jose Aguirre", "Oleo", "8:00"))
        Evento.add(evento("German Traña Obando", "Lapiz", "10:00"))
        Evento.add(evento("Pol Lendent", "Acrilico", "03:00"))
        Evento.add(evento("Maribel Flores", "Oleo", "11:00"))
        Evento.add(evento("Nana Tchelidze", "Canva", "04:00"))
        Evento.add(evento("Armando Jose Aguirre", "Oleo", "8:00"))
        Evento.add(evento("German Traña Obando", "Lapiz", "10:00"))
        Evento.add(evento("Pol Lendent", "Acrilico", "03:00"))
        Evento.add(evento("Maribel Flores", "Oleo", "11:00"))
        Evento.add(evento("Nana Tchelidze", "Canva", "04:00"))
        return Evento
    }

}