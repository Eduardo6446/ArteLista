package com.example.laboratorio4.model

class artista(private var NombreArtista:String,
              private var categoriaArtista:String,
              private var PaisArtista:String){

    fun getNombreArtista():String{return this.NombreArtista}
    fun getcategoriaArtista():String{return this.categoriaArtista}
    fun getPaisArtista():String{return this.PaisArtista}
}