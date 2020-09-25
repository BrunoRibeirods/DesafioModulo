package br.com.digitalhouse.desafio

open class Professor(open val nome: String, open val sobrenome: String, open var TempoDeCasa: Int, open val codigoProfessor: Int) {
    override fun equals(other: Any?): Boolean {
        return other == codigoProfessor
    }
}