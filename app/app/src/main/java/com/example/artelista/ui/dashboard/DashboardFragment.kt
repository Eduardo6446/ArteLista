package com.example.artelista.ui.dashboard

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.artelista.R
import com.example.artelista.adapter.adapter_galeria
import com.example.artelista.databinding.FragmentDashboardBinding
import com.example.artelista.model.galeria

class DashboardFragment : Fragment() {

    private var fbinding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = fbinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
          /* val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
           */
        fbinding = FragmentDashboardBinding.inflate(inflater, container, false)

        val view: View = binding.root

       // val textView: TextView = binding.textDashboard

       /* dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
       */
        val reciclergaleria :RecyclerView = fbinding!!.rvGaleria
        reciclergaleria.layoutManager = LinearLayoutManager(context)
        val adaptergaleria = adapter_galeria(getGaleria(),R.layout.item_galeria,Activity())
        reciclergaleria.adapter = adaptergaleria
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fbinding = null
    }

    fun getGaleria(): ArrayList<galeria> {
        //--------------
        val Galeria: ArrayList<galeria> = ArrayList<galeria>()
        //-------------
        Galeria.add(galeria("Henciel Daniel Bulimar", "1,600", "https://artelista.s3.amazonaws.com/obras/big/3/5/5/1209702-607458d7c0c2a.jpg", "Memories"))
        Galeria.add(galeria("Jesús Cuenca", "1,200", "https://artelista.s3.amazonaws.com/obras/big/1/6/4/1209582.jpg", "Memories"))
        Galeria.add(galeria("Pol Ledent", "1,600", "https://artelista.s3.amazonaws.com/obras/fichas/1/4/6/1209343.jpg", "Como en invierno"))
        Galeria.add(galeria("Maribel Flores", "1,600", "https://artelista.s3.amazonaws.com/obras/fichas/7/4/0/1208970.jpg", "Blossom"))
        Galeria.add(galeria("Nana Tchelidze", "575", "https://artelista.s3.amazonaws.com/obras/big/2/3/8/1245944.jpg", "El Puente"))
        return Galeria
    }

}