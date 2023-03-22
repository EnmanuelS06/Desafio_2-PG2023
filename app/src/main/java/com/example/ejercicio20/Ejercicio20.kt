package com.example.ejercicio20

import kotlin.math.PI

// Definimos la clase abstracta Figura
abstract class Figura(val nombre: String) {
    // Método abstracto para calcular el área de la figura
    abstract fun area(): Double
}

// Clase Triangulo que extiende de Figura
class Triangulo(val base: Double, val altura: Double) : Figura("Triangulo Rectangulo") {
    // Implementación del método área para un triángulo
    override fun area(): Double = base * altura / 2
}

// Clase Cuadrado que extiende de Figura
class Cuadrado(val lado: Double) : Figura("Cuadrado") {
    // Implementación del método área para un cuadrado
    override fun area(): Double = lado * lado
}

// Clase Circulo que extiende de Figura
class Circulo(val radio: Double) : Figura("Circulo") {
    // Implementación del método área para un círculo
    override fun area(): Double = PI * radio * radio
}

// Clase Rectangulo que extiende de Figura
class Rectangulo(val base: Double, val altura: Double) : Figura("Rectangulo") {
    // Implementación del método área para un rectángulo
    override fun area(): Double = base * altura
}

fun main() {
    // Creamos las instancias de las figuras con los valores especificados
    val figura1 = Circulo(5.5)
    val figura2 = Rectangulo(10.3, 20.2)
    val figura3 = Cuadrado(4.0)
    val figura4 = Triangulo(9.0, 21.0)

    // Mostramos en pantalla el nombre y el área de cada figura
    println("${figura1.nombre}: \nRadio ${figura1.radio} \nÁrea ${String.format("%.2f",figura1.area())}")
    println("${figura2.nombre}: \nBase ${figura2.base}   Altura ${figura2.altura} \nÁrea ${String.format("%.2f",figura2.area())}")
    println("${figura3.nombre}: \nLado ${figura3.lado}   \nÁrea ${String.format("%.2f",figura3.area())}")
    println("${figura4.nombre}: \nBase ${figura4.base}   Altura ${figura4.altura} \nÁrea ${String.format("%.2f",figura4.area())}")
}