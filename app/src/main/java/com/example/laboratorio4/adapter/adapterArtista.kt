package com.example.laboratorio4.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio4.R
import com.example.laboratorio4.model.artista

class adapterArtista (Artistas:ArrayList<artista>, resource:Int, activity: Activity): RecyclerView.Adapter<adapterArtista.ArtistaViewHolder>() {
    private val artistas:ArrayList<artista>
    private val resource:Int
    private val activity: Activity

    init{
        this.artistas=Artistas
        this.resource=resource
        this.activity=activity
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): adapterArtista.ArtistaViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(resource,parent,false)
        return ArtistaViewHolder(view)
    }

    override fun onBindViewHolder(holder: adapterArtista.ArtistaViewHolder, position: Int) {
        val artista : artista =artistas[position]
        holder.tvNombreArtista.setText(artista.getNombreArtista())
        holder.tvCategoriaArtista.setText(artista.getcategoriaArtista())
        holder.tvPaisArtista.setText(artista.getPaisArtista())

       holder.itemView.setOnClickListener{
            Navigation.findNavController(holder.itemView).navigate(R.id.artistDetFragment)

        }

    }

    override fun getItemCount(): Int {
        return artistas.size
    }
    inner class ArtistaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvNombreArtista: TextView
        val tvCategoriaArtista : TextView
        val tvPaisArtista: TextView

        init{
            tvNombreArtista=itemView.findViewById<View>(R.id.tvNombreArtista) as TextView
            tvCategoriaArtista = itemView.findViewById<View>(R.id.tvCategoriaArtista) as TextView
            tvPaisArtista = itemView.findViewById<View>(R.id.tvPaisArtista) as TextView
        }


    }
}