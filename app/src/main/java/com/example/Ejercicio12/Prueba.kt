package com.example.ejercicio12


fun main(){

    //Solicitamos la cantidad de filas de filas que llevara la piramide

     print("Ingresa el número de filas: ")
       val n: Int? = readLine()?.toIntOrNull()

       if (n != null) {
           for (i in 1..n) {

               /*Imprimimos los espacios vacios*/
               for(j in 1..n-i)print(" ")
               //Imprimimos los numeros hasta i
               for (j in 1..i)print(j)
               //Empezamos a imprimir los numeros en reversa
               for (j in i - 1 downTo 1) print(j)
               //salatamos de fila
               println()

           }

       }

}

