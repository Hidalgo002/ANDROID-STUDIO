package com.example.codekotlin

class Persona (nombre:String, primerApellido:String, edad:Int:Int=18){
    var nombre = nombre
    var primerApellido = primerApellido
    var edad = edad

    fun main(){
        val persona1 = Persona("michel", "Fassbender",56)
        print(persona1)
        print(persona1.edad)
    }
}