package br.com.digitalhouse.desafio

class Curso(val nome: String, val codigoCurso: Int, var professorTitular: ProfessorTitular?,
            var professorAdjunto: ProfessorAdjunto?, val quantidadeMaxima: Int,
            val listaDeMatriculados: MutableList<Aluno> = mutableListOf()) {

    init {
        if (listaDeMatriculados.size == quantidadeMaxima){
            println("Aula lotada!")
        }
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if (listaDeMatriculados.contains(umAluno)){
            println("Aluno já cadastrado.")
            return false
        }
        if (listaDeMatriculados.size >= quantidadeMaxima){
            println("Não foi possivel matricular pois a quantidade de alunos foi ultrapassada.")
            return false
        }else{
            println("Aluno Matriculado com sucesso curso de: $nome")
            listaDeMatriculados.add(umAluno)
            return true
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