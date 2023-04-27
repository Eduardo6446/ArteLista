package com.example.artelista.adapter
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation

import androidx.recyclerview.widget.RecyclerView
import com.example.artelista.R
import com.example.artelista.model.evento
class adapterevento(Evento: ArrayList<evento>, resource: Int, activity: Activity) :
    RecyclerView.Adapter<adapterevento.EventoViewHolder>() {

    private val evento: ArrayList<evento>
    private val resource: Int
    private val activity: Activity

    init {
        this.evento = Evento
        this.resource = resource
        this.activity = activity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(resource, parent, false)
        return EventoViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventoViewHolder, position: Int) {
        val evento: evento = evento[position]
        holder.tvTituloEvento.setText(evento.getTituloEvento())
        holder.tvCategoriaEvento.setText(evento.getCategoriaEvento())
        holder.tvHoraEvento.setText(evento.getHoraEvento())

        holder.itemView.setOnClickListener {
            Navigation.findNavController(holder.itemView).navigate(
                R.id.fragment_ubicacion
            )
        }

    }
    //------------------------------
    override fun getItemCount(): Int {
        return evento.size
    }
    //Adapter versus la interface de cada item del recycler
    inner class EventoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //-------------------------
        val tvTituloEvento: TextView
        val tvCategoriaEvento: TextView
        val tvHoraEvento: TextView

        //-----------------------
        init {
            tvTituloEvento = itemView.findViewById<View>(R.id.tvTituloEvento) as TextView
            tvCategoriaEvento = itemView.findViewById<View>(R.id.tvCategoriaEvento) as TextView
            tvHoraEvento = itemView.findViewById<View>(R.id.tvHoraEvento) as TextView
        }
    }
}