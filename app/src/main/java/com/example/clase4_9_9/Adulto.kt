package com.example.clase4_9_9

class Adulto(

    private val nombre: String,
    private val edad: Int,
    private val profesion: String,
    private val estado_civil: EstadoCivil

): Persona(nombre, edad), AccionesAdulto, Acciones {

    override fun getNombre(): String {
        return "mi nombre es: ${this.nombre}"
    }

    override fun getEdad(): String {
        return "mi edad es: ${this.edad}"
    }

    fun getProfesion(): String
    {
        return "mi profesion es: ${this.profesion}"
    }

    override fun trabajar(): String {
        return "estoy trabajando"
    }

    override fun estudiar(): String {
        return "estoy estudiando"
    }

    override fun comer(): String {
        TODO("Not yet implemented")
    }


}

enum class EstadoCivil{

    CASADO,
    SOLTERO,
    DIVORCIADO,
    CONVIVENCIA,
    VIUDO

}