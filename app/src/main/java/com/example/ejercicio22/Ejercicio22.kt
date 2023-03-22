package com.example.ejercicio22

data class Clase(val profesor:String,val materia:String, val laboratorios:Int,val conferencias:Int)

fun main(){
   val clase= Clase("Glenda Barrios Aguirre","Programacion Grafica",10,7)
    /*println("Ingrese en datos en el orden Profesor, Materia, Laboratorios, Conferencias")
    var clase = Clase(
        readln()!!,
        readln()!!,
        readln()!!.toInt(),
        readln()!!.toInt()
    )*/
    println("Profesor: ${clase.profesor}\nMateria: ${clase.materia}\nLaboratorios: ${clase.laboratorios}\nConferencias: ${clase.conferencias}")
}
