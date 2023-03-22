package com.example.ejercicio16

fun main() {
    // Declaración e inicialización de los números
    val numeros= intArrayOf(10,15,40)

    // Cálculo de la suma
    val suma = numeros.sum()

    // Cálculo del producto
    val producto = numeros.reduce{p, i-> p*i}

    // Cálculo del promedio
    val promedio = numeros.average()

    // Muestra el resultado por pantalla
    println("La suma es: $suma")
    println("El producto es: $producto")
    println(String.format("El promedio es: %.2f",promedio))
}
