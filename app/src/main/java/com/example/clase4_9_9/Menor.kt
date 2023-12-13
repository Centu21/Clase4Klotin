package com.example.clase4_9_9

class Menor(

    private val nombre: String,
     private val edad: Int,
    private val colegio: String,
    private val actividad: Actividad

):Persona(nombre, edad ), Acciones, AccionesMenor
{

    override fun getNombre(): String
    {
        return "mi nombre es: ${this.nombre}"
    }
    override fun getEdad(): String
    {
        return "mi nombre es: reservada"
    }
    override fun estudiar(): String {
        return "estoy estudiando en el cole"
    }

    override fun comer(): String {
        TODO("Not yet implemented")
    }

    override fun jugar(): String {
        return "estoy jugando a ${this.actividad}"
    }

}

enum class Actividad{
    FUTBOL,
    DANZA,
    PINTURA,
    HANDBALL,
    GUITARRA
}