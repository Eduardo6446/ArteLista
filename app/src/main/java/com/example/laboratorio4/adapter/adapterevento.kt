package com.example.laboratorio4.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio4.R
import com.example.laboratorio4.model.evento


class adapterevento(Eventos:ArrayList<evento>, resource:Int, activity: Activity): RecyclerView.Adapter<adapterevento.EventoViewHolder>() {
    private val eventos:ArrayList<evento>
    private val resource:Int
    private val activity: Activity

    init{
        this.eventos=Eventos
        this.resource=resource
        this.activity=activity
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): adapterevento.EventoViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(resource,parent,false)
        return EventoViewHolder(view)
    }

    override fun onBindViewHolder(holder: adapterevento.EventoViewHolder, position: Int) {
        val evento : evento =eventos[position]
        holder.tvTituloEvento.setText(evento.gettituloevento())
        holder.tvHoraEvento.setText(evento.gethoraevento())
        holder.tvEventCategory.setText(evento.getcategoriaevento())
       holder.itemView.setOnClickListener{
            Navigation.findNavController(holder.itemView).navigate(R.id.locationFragment)

        }

    }

    override fun getItemCount(): Int {
        return eventos.size
    }
    inner class EventoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvTituloEvento: TextView
        val tvHoraEvento : TextView
        val tvEventCategory: TextView

        init{
            tvTituloEvento=itemView.findViewById<View>(R.id.tvTituloEvento) as TextView
            tvHoraEvento = itemView.findViewById<View>(R.id.tvEventoHora) as TextView
            tvEventCategory = itemView.findViewById<View>(R.id.tvCategoriaEvento) as TextView
        }


    }
}