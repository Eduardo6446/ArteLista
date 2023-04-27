package com.example.artelista.model

class artista (private var nombreartista:String,
               private var categoriaartista:String,
               private var paisartista:String){

    fun getNombreArtista():String {
        return this.nombreartista
    }

    fun getCategoriaArtista():String {
        return this.categoriaartista
    }

    fun getPaisArtista():String {
        return this.paisartista
    }


}