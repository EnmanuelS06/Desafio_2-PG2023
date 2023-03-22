package com.example.ejercicio19

class Persona(
    var nombres: String,
    var apellidos: String,
    var cedula: String,
    var sexo: String,
    var anioNacimiento: Int
) {
    // Métodos para obtener y establecer cada propiedad

    fun ObtenerNombres(): String {
        return nombres
    }

    fun ObtenerApellidos(): String {
        return apellidos
    }

    fun ObtenerCedula(): String {
        return cedula
    }

    fun ObtenerSexo(): String {
        return sexo
    }

    fun ObtenerAnioNacimiento(): Int {
        return anioNacimiento
    }
}

fun main() {
    val persona = Persona("Enmanuel", "Sanchez Rugama", "001-060404-xxxxx", "M", 2004)

    println("Nombres: ${persona.ObtenerNombres()}")
    println("Apellidos: ${persona.ObtenerApellidos()}")
    println("Cedula: ${persona.ObtenerCedula()}")
    println("Sexo: ${persona.ObtenerSexo()}")
    println("Año de nacimiento: ${persona.ObtenerAnioNacimiento()}")
}