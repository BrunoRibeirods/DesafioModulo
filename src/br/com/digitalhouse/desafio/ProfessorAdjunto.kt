package br.com.digitalhouse.desafio

class ProfessorAdjunto(
    override val nome: String, override val sobrenome: String, override var TempoDeCasa: Int,
    override val codigoProfessor: Int, val monitoriaHoras: Int) : Professor{

    override fun equals(other: Any?): Boolean {
        return other == codigoProfessor
    }
}