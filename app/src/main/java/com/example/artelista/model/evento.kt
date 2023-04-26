package com.example.artelista.model

class evento(private var tituloevento:String,
             private var categoriaevento:String,
             private var horaevento:String){

    fun getTituloEvento():String {return this.tituloevento}
    fun getCategoriaEvento():String {return this.categoriaevento}
    fun getHoraEvento():String {return this.horaevento}
}