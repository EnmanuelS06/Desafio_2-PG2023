package com.example.ejercicio13

fun main() {
    val x = 144
    val y = 999

    println("El valor de x es: $x")
    println("El valor de y es: $y")
    println("La suma de x e y es: ${sumar(x, y)}")
    println("La resta de x e y es: ${restar(x, y)}")
    println("La división de x e y es: ${dividir(x, y)}")
    println("La multiplicación de x e y es: ${multiplicar(x, y)}")
}

fun sumar(a: Int, b: Int): Int {
    return (a + b)
}

fun restar(a: Int, b: Int): Int {
    return a - b
}

fun dividir(a: Int, b: Int): Double {
    return a.toDouble() / b.toDouble()
}

fun multiplicar(a: Int, b: Int): Int {
    return a * b
}