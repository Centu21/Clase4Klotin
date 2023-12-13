package com.example.clase4_9_9

abstract class Persona(
    private val nombre: String,
    private val edad: Int
) {
    abstract fun getNombre(): String

    abstract   fun getEdad(): String


}