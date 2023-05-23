package com.example.laboratorio4.model

class evento (private var tituloEvento:String,
              private var categoriaEvento:String,
              private var horaEvento:String){

    fun gettituloevento():String{return this.tituloEvento}
    fun gethoraevento():String{return this.horaEvento}
    fun getcategoriaevento():String{return this.categoriaEvento}


}