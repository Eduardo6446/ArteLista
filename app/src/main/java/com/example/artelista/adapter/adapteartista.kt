package com.example.artelista.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.artelista.R
import com.example.artelista.model.artista


class adapteartista (Artista: ArrayList<artista>, resource: Int, activity: Activity) :
    RecyclerView.Adapter<adapteartista.ArtistaViewHolder>() {

    private val artistas: ArrayList<artista>
    private val resource: Int
    private val activity: Activity

    init {
        this.artistas = Artista
        this.resource = resource
        this.activity = activity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(resource, parent, false)
        return ArtistaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtistaViewHolder, position: Int) {
        val artista: artista = artistas[position]
        holder.tvNombreArtista.setText(artista.getNombreArtista())
        holder.tvCategoriasArtista.setText(artista.getCategoriaArtista())
        holder.tvPaisArtista.setText(artista.getPaisArtista())

        holder.itemView.setOnClickListener {
            Navigation.findNavController(holder.itemView).navigate(
                R.id.fragment_artistadet
            )
        }

    }
    //------------------------------
    override fun getItemCount(): Int {
        return artistas.size
    }
    //Adapter versus la interface de cada item del recycler
    inner class ArtistaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //-------------------------
        val tvNombreArtista: TextView
        val tvCategoriasArtista: TextView
        val tvPaisArtista: TextView

        //-----------------------
        init {
            tvNombreArtista = itemView.findViewById<View>(R.id.tvNombreArtista) as TextView
            tvCategoriasArtista = itemView.findViewById<View>(R.id.tvCategoriaArtista) as TextView
            tvPaisArtista = itemView.findViewById<View>(R.id.tvPaisArtista) as TextView
        }
    }
}