package br.com.digitalhouse.desafio

class ProfessorTitular(
    override val nome: String, override val sobrenome: String, override var TempoDeCasa: Int,
    override val codigoProfessor: Int, val especialidade: String) :
    Professor {

    override fun equals(other: Any?): Boolean {
        return other == codigoProfessor
    }
}