package com.example.ejercicio18

fun main() {
    //val numeros = mutableListOf<Int>()
    val numeros = intArrayOf(1,2,3,4,5,6,7,8,9,10,1,3,5,6)
    val numerosUnicos = mutableSetOf<Int>()
    val numerosDuplicados = mutableSetOf<Int>()

   /* print("Ingresa la cantidad de números a evaluar: ")
    val cantidadNumeros = readLine()?.toIntOrNull() ?: 0

    for (i in 1..cantidadNumeros) {
        print("Ingresa el número $i: ")
        numeros.add(readLine()?.toIntOrNull() ?: 0)
    }*/

    println("Elementos del array: ")


    for((i,e) in numeros.withIndex()){
        println("Elemento[$i]= $e")
        if(!numerosUnicos.add(e)){
            numerosDuplicados.add(e)
        }
    }
    println("Los elementos duplicados son: $numerosDuplicados")
}