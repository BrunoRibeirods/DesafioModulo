package br.com.digitalhouse.desafio

class DigitalHouseManager(val listaAlunos: MutableList<Aluno>, val listaProfessores: MutableList<Professor>,
                          val listaCursos: MutableList<Curso>, val listaMatricula: MutableList<Matricula>){

    fun registrarCurso(curso: Curso){
        listaCursos.add(curso)
        println("Curso: ${curso.nome} adicionado a lista")
    }

    fun excluirCurso(codigoCurso: Int){
        for (curso in listaCursos){
            if (curso.codigoCurso == codigoCurso){
                listaCursos.remove(curso)
                return
            }
        }
        println("Curso não identificado.")
    }

    fun registrarProfessorAdjunto(professorAdjunto: ProfessorAdjunto){
        professorAdjunto.TempoDeCasa = 0
        listaProfessores.add(professorAdjunto)
        println("Professor ${professorAdjunto.nome} adicionado a lista.")
    }

    fun registrarProfessorTitular(professorTitular: ProfessorTitular){
        professorTitular.TempoDeCasa = 0
        listaProfessores.add(professorTitular)
        println("Professor ${professorTitular.nome} adicionado a lista.")
    }

    fun excluirProfessor(codigoProfessor: Int){
        for (professor in listaProfessores){
            if (professor.codigoProfessor == codigoProfessor){
                println("Professor: ${professor.nome} foi removido.")
                listaProfessores.remove(professor)
                return
            }
        }
        println("Professor não identificado.")
    }

    fun registrarAluno(aluno: Aluno){
        listaAlunos.add(aluno)
        println("Aluno: ${aluno.nome} foi adicionado.")
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso:  Int){

    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular:  Int, codigoProfessorAdjunto: Int){

    }
}