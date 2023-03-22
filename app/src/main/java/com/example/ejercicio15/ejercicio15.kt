package com.example.ejercicio15

fun main(){
    val numero= intArrayOf(1,2,3,4,5,6,7,8,9,10)
    var suma=0


    for(numeros in numero){
       suma+=numeros
    }
    numero.reduce(){acc,numero->acc*numero  }
    val promedio:Double = suma.toDouble()/numero.size
    println("La suma de los numeros es: $suma")
    println("El promedio de los numeros es: $promedio")


}
