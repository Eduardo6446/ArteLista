package com.example.artelista.model

class galeria(private var artistagaleria:String,
              private var preciogaleria:String,
              private var imagengaleria:String,
              private var titulogaleria:String){

    fun getartistagaleria():String {return this.artistagaleria}
    fun getpreciogaleria():String {return this.preciogaleria}
    fun getimagengaleria():String {return this.imagengaleria}
    fun gettitulogaleria():String {return this.titulogaleria}
}