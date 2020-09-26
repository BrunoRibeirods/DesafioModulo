package br.com.digitalhouse.desafio

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class Matricula(val aluno: Aluno, val curso: Curso, val data: LocalDateTime = LocalDateTime.now()) {
    init {
        val formatar = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val dataAtual = data.format(formatar)

        curso.adicionarUmAluno(aluno)
        println(dataAtual)
    }
}