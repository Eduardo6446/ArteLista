package com.example.laboratorio4.model

class galeria(private var artistagaleria:String,
               private var preciogaleria:String,
               private var imggaleria:String,
               private var titulogaleria:String) {
    fun getartistagaleria():String{return this.artistagaleria}
    fun getpreciogaleria():String{return this.preciogaleria}
    fun getimagengaleria():String{return this.imggaleria}
    fun gettitulogaleria():String{return this.titulogaleria}
}