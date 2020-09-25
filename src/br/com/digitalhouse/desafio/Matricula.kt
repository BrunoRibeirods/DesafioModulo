package br.com.digitalhouse.desafio

import java.util.*

class Matricula(val aluno: Aluno, val curso: Curso, var data: Int) {
    init {
        curso.adicionarUmAluno(aluno)
    }
}