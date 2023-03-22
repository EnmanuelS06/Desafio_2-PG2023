package com.example.ejercicio12


fun main(){

    //Ejercicio 12
     print("Ingresa el número de filas: ")
       val n: Int? = readLine()?.toIntOrNull()

       if (n != null) {
           for (i in 1..n) {

               for(j in 1..n-i)print(" ")
               for (j in 1..i)print(j)
               for (j in i - 1 downTo 1) print(j)

               println()

           }

       } else {
           println("El valor ingresado no es válido.")
       }

}

