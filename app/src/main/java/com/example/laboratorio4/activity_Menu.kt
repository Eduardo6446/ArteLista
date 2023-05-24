package com.example.laboratorio4

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.laboratorio4.databinding.ActivityMenuBinding
import com.example.laboratorio4.model.artista
import com.example.laboratorio4.model.evento
import com.example.laboratorio4.model.galeria
import com.google.firebase.firestore.FirebaseFirestore
import org.json.JSONArray
import org.json.JSONObject

class activity_Menu : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    private var IsLoaded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        configNav()

        if(!IsLoaded){
            Load()
            IsLoaded=true
        }




    }
    private fun Load(){
        //-----Cargar Datos Galeria
        val jsonGaleria = JSONArray("[\n" +
                "            {\n" +
                "                'artistagaleria' : 'Henciel Daniel Bulimar',\n" +
                "                'titulogaleria' : 'Memories',\n" +
                "                'preciogaleria' : '1,600',\n" +
                "                'imagengaleria' : 'https://artelista.s3.amazonaws.com/obras/big/3/5/5/1209702-607458d7c0c2a.jpg'\n" +
                "            },\n" +
                "            {\n" +
                "                'artistagaleria' : 'María Berroterán',\n" +
                "                'titulogaleria' : 'Pallace',\n" +
                "                'preciogaleria' : '1,800',\n" +
                "                'imagengaleria' : 'https://artelista.s3.amazonaws.com/obras/big/8/3/9/1201563-602e9746f3abf.jpg'\n" +
                "            },\n" +
                "            {\n" +
                "                'artistagaleria' : 'Marilin López',\n" +
                "                'titulogaleria' : 'Amanecer',\n" +
                "                'preciogaleria' : '1,200',\n" +
                "                'imagengaleria' : 'https://artelista.s3.amazonaws.com/obras/big/3/6/8/1204092-6006ef285e45d.jpg'\n" +
                "            },\n" +
                "            {\n" +
                "                'artistagaleria' : 'German Aguirre',\n" +
                "                'titulogaleria' : 'Atardecer',\n" +
                "                'preciogaleria' : '800',\n" +
                "                'imagengaleria' : 'https://artelista.s3.amazonaws.com/obras/big/3/5/5/1209702-607458d7c0c2a.jpg'\n" +
                "            },\n" +
                "            {\n" +
                "                'artistagaleria' : 'Brenda Martinez',\n" +
                "                'titulogaleria' : 'Hogar',\n" +
                "                'preciogaleria' : '1,100',\n" +
                "                'imagengaleria' : 'https://artelista.s3.amazonaws.com/obras/big/5/5/7/1191748-5f1033f19f2e4.jpg'\n" +
                "            },\n" +
                "            {\n" +
                "                'artistagaleria' : 'Karla Martinez',\n" +
                "                'titulogaleria' : 'Memories',\n" +
                "                'preciogaleria' : '1,600',\n" +
                "                'imagengaleria' : 'https://artelista.s3.amazonaws.com/obras/big/7/2/3/1190859-5ef3a721f3127.jpg'\n" +
                "            }\n" +
                "        ]")
        val fireDB: FirebaseFirestore = FirebaseFirestore.getInstance()
        //-----------------------
        if(!IsLoaded){

            for (i in 0 until jsonGaleria.length())
            {
                val objGaleria = jsonGaleria.get(i) as JSONObject
                var Galeria = galeria()

                Galeria.artistagaleria = objGaleria.getString("artistagaleria")
                Galeria.preciogaleria = objGaleria.getString("preciogaleria")
                Galeria.imggaleria = objGaleria.getString("imagengaleria")
                Galeria.titulogaleria = objGaleria.getString("titulogaleria")
                fireDB.collection("Galeria").document().set(Galeria)
            }
        }
        //-------Cargar datos Artista
        val jsonArtista = JSONArray( "[\n" +
                "            {\n" +
                "                'NombreArtista' : 'Armando Jose Aguirre',\n" +
                "                'categoriaArtista' : 'Oil',\n" +
                "                'PaisArtista' : 'Nicaragua'\n" +
                "            },\n" +
                "            {\n" +
                "                'NombreArtista' : 'German Traña Obando',\n" +
                "                'categoriaArtista' : 'Pencil',\n" +
                "                'PaisArtista' : 'Costa Rica'\n" +
                "            },\n" +
                "            {\n" +
                "                'NombreArtista' : 'Pol Ledent',\n" +
                "                'categoriaArtista' : 'Acrilic',\n" +
                "                'PaisArtista' : 'Panama'\n" +
                "            },\n" +
                "            {\n" +
                "                'NombreArtista' : 'Maribel Flores',\n" +
                "                'categoriaArtista' : 'Oil',\n" +
                "                'PaisArtista' : 'Nicaragua'\n" +
                "            },\n" +
                "            {\n" +
                "               'NombreArtista' : 'Nana Tchelidze',\n" +
                "                'categoriaArtista' : 'Canva',\n" +
                "                'PaisArtista' : 'Guatemala'\n" +
                "            }\n" +
                "            ]")
        if(!IsLoaded){

            for(i in 0 until jsonArtista.length())
            {
                val objartista = jsonArtista.get(i) as JSONObject
                var Artista = artista()
                Artista.NombreArtista = objartista.getString("NombreArtista")
                Artista.categoriaArtista = objartista.getString("categoriaArtista")
                Artista.PaisArtista = objartista.getString("PaisArtista")
                fireDB.collection("Artista").document().set(Artista)
            }
            //------Cargar datos Evento
            val jsonEvento = JSONArray( "[\n" +
                    "            {\n" +
                    "                'tituloEvento' : 'Armando Jose Aguirre',\n" +
                    "                'categoriaEvento' : 'Oil',\n" +
                    "                'horaEvento' : '08:00'\n" +
                    "            },\n" +
                    "            {\n" +
                    "                'tituloEvento' : 'German Traña Obando',\n" +
                    "                'categoriaEvento' : 'Pencil',\n" +
                    "                'horaEvento' : '10:00'\n" +
                    "            },\n" +
                    "            {\n" +
                    "                'tituloEvento' : 'Pol Ledent',\n" +
                    "                'categoriaEvento' : 'Canva',\n" +
                    "                'horaEvento' : '11:00'\n" +
                    "            },\n" +
                    "            {\n" +
                    "               'tituloEvento' : 'Maribel Flores',\n" +
                    "                'categoriaEvento' : 'Oil',\n" +
                    "                'horaEvento' : '03:00'\n" +
                    "            },\n" +
                    "            {\n" +
                    "              'tituloEvento' : 'Nana Tchelidze',\n" +
                    "                'categoriaEvento' : 'Canva',\n" +
                    "                'horaEvento' : '04:00'\n" +
                    "            }\n" +
                    "            ]")
            if(!IsLoaded){
                for(i in 0 until jsonEvento.length())
                {
                    val objartista = jsonEvento.get(i) as JSONObject
                    var Evento = evento()
                    Evento.tituloEvento = objartista.getString("tituloEvento")
                    Evento.categoriaEvento = objartista.getString("categoriaEvento")
                    Evento.horaEvento = objartista.getString("horaEvento")
                    fireDB.collection("Evento").document().set(Evento)
                }
            }
        }
    }
    protected fun configNav()
    {
        val bMenu:BottomNavigationView= binding.navView
        NavigationUI.setupWithNavController(bMenu,Navigation.findNavController(this,R.id.nav_host_fragment_activity_menu))
    }
}