package com.example.ejercicio21

class Insecto(
    private val longitud: Float, // longitud del insecto (en cm)
    private val numAlas: Int, // número de alas del insecto
    private val numPatas: Int, // número de patas del insecto
    private val color: String, // color del insecto
    private val numAntenas: Int, // número de antenas del insecto
    private val tipoInsecto: String // tipo de insecto (por ejemplo, mariposa, abeja, hormiga, etc.)
) {

    fun imprimir() {
        println("Longitud: $longitud cm")
        println("Número de alas: $numAlas")
        println("Número de patas: $numPatas")
        println("Color: $color")
        println("Número de antenas: $numAntenas")
        println("Tipo de insecto: $tipoInsecto")
    }
}


fun main() {
    val insecto = Insecto(21.0f, 2, 6, "Ambar y negro", 2, "Macrodontia cervicornis")


    insecto.imprimir()
}