package br.com.digitalhouse.desafio

class Curso(val nome: String, val codigoCurso: Int, val professorTitular: ProfessorTitular?,
            val professorAdjunto: ProfessorAdjunto?, val quantidadeMaxima: Int,
            val listaDeMatriculados: MutableList<Aluno>) {

    init {
        val result = listaDeMatriculados.size < quantidadeMaxima
        println("Numero maximo de alunos: $quantidadeMaxima, lista de matriculados -> ${listaDeMatriculados.size}, Resultado -> $result")
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        return if (listaDeMatriculados.size > quantidadeMaxima){
            false
        }else {
            listaDeMatriculados.add(umAluno)
            true
        }
    }

    fun excluirAluno(umAluno: Aluno){
        if (listaDeMatriculados.contains(umAluno)){
            listaDeMatriculados.remove(umAluno)
        }else{
            println("Aluno não encontrado.")
        }
    }

    override fun equals(other: Any?): Boolean {
        return other == codigoCurso
    }
}