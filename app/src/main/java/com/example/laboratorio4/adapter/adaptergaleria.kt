package com.example.laboratorio4.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio4.model.galeria
import com.example.laboratorio4.R
import com.squareup.picasso.Picasso

class adaptergaleria(Galerias:ArrayList<galeria>,resource:Int, activity: Activity): RecyclerView.Adapter<adaptergaleria.GaleriaViewHolder>() {
    private val galerias:ArrayList<galeria>
    private val resource:Int
    private val activity:Activity

    init{
        this.galerias=Galerias
        this.resource=resource
        this.activity=activity
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): adaptergaleria.GaleriaViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(resource,parent,false)
        return GaleriaViewHolder(view)
    }

    override fun onBindViewHolder(holder: adaptergaleria.GaleriaViewHolder, position: Int) {
        val galeria :galeria=galerias[position]
/*        holder.tvArtistaGaleria.setText(galeria.getartistagaleria())
        holder.tvPrecioGaleria.setText(galeria.getpreciogaleria())
        holder.tvTituloGaleria.setText(galeria.gettitulogaleria())*/
        //Picasso.get().load(galeria.getimagengaleria()).into(holder.imgGaleria)
       holder.itemView.setOnClickListener{
            Navigation.findNavController(holder.itemView).navigate(R.id.fragment_galeriadet)

        }

    }

    override fun getItemCount(): Int {
        return galerias.size
    }
    inner class GaleriaViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val tvArtistaGaleria: TextView
        val tvPrecioGaleria : TextView
        val tvTituloGaleria:TextView
        val imgGaleria:ImageView
        init{
            tvArtistaGaleria=itemView.findViewById<View>(R.id.tvArtista) as TextView
            tvPrecioGaleria = itemView.findViewById<View>(R.id.tvPrecioArte) as TextView
            tvTituloGaleria = itemView.findViewById<View>(R.id.tvTituloArte) as TextView
            imgGaleria= itemView.findViewById<View>(R.id.imgArteGaleria) as ImageView
        }


    }
}