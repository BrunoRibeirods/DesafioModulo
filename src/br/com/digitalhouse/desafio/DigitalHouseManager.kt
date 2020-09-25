package br.com.digitalhouse.desafio


class DigitalHouseManager(val listaAlunos: MutableList<Aluno> = mutableListOf(), val listaProfessores: MutableMap<Int, Professor> = mutableMapOf(),
                          val listaCursos: MutableList<Curso> = mutableListOf(), val listaMatricula: MutableList<Matricula> = mutableListOf()){

    fun registrarCurso(nome: String, codigoCurso: Int,quantidadeMaximaDeAlunos: Int){
        for (cursos in listaCursos){
            if (cursos.equals(codigoCurso)){
                println("Curso já cadastrado!!")
                return
            }
        }
        listaCursos.add(Curso(nome, codigoCurso, null, null, quantidadeMaximaDeAlunos))
        println("Curso: ${nome} adicionado a lista.")
    }

    fun excluirCurso(codigoCurso: Int){
        for (curso in listaCursos){
            if (curso.codigoCurso == codigoCurso){
                println("Curso: ${curso.nome} removido da lista.")
                listaCursos.remove(curso)
                return
            }
        }
        println("Curso não identificado.")
    }

    fun registrarProfessorAdjunto(nome: String , sobrenome: String ,codigoProfessor: Int, quantidadeDeHoras: Int){
        if (codigoProfessor in listaProfessores.keys){
            println("Professor já cadastrado! tente novamente.")
            return
        }
        listaProfessores[codigoProfessor] = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras)
        println("Prof. $nome -> Adjunto -> adicionado a lista.")
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String,codigoProfessor: Int, especialidade: String){
        if (codigoProfessor in listaProfessores.keys){
            println("Professor já cadastrado! tente novamente.")
            return
        }
        listaProfessores[codigoProfessor] = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        println("Prof. $nome -> Titular -> adicionado a lista.")
    }

    fun excluirProfessor(codigoProfessor: Int){
        if (codigoProfessor in listaProfessores.keys){
            listaProfessores.remove(codigoProfessor)
            println("Professor Removido")
        } else {
            println("Professor não identificado.")
        }

    }


    fun registrarAluno(nome: String, sobrenome: String, codigoAluno:Int){
        for (alunos in listaAlunos){
            if (alunos.equals(codigoAluno)){
                println("Aluno já cadastrado!!")
                return
            }
        }
        listaAlunos.add(Aluno(nome, sobrenome, codigoAluno))
        println("Aluno: $nome foi Cadastrado.")
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso:  Int){
        for(aluno in listaAlunos){
            for(curso in listaCursos){
                if(aluno.codigo == codigoAluno && curso.codigoCurso == codigoCurso) {
                    listaMatricula.add(Matricula(aluno, curso, 0))
                    return
                }
            }
        }
        return println("Erro ao matricular")
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular:  Int, codigoProfessorAdjunto: Int){
        for(curso in listaCursos){
            if (curso.codigoCurso == codigoCurso){
               if ( codigoProfessorTitular in listaProfessores.keys){
                   curso.professorTitular = listaProfessores[codigoProfessorTitular] as ProfessorTitular?
               }else{
                   println("Professor Titular não existente")
               }
                if (codigoProfessorAdjunto in listaProfessores.keys){
                    curso.professorAdjunto = listaProfessores[codigoProfessorAdjunto] as ProfessorAdjunto?
                }else{
                    println("Professor Adjunto não existente")
                }
                println("O curso de ${curso.nome} terá os professores ${curso.professorTitular?.nome} e ${curso.professorAdjunto?.nome}")
            }
        }

    }

    fun consultarCurso(codigoAluno: Int){
        for (curso in listaCursos){
            for (alunos in curso.listaDeMatriculados){
                if (alunos.codigo == codigoAluno){
                    println("Olá ${alunos.nome} voce está matriculado no curso de: ${curso.nome}")
                    return
                }
            }
        }
        println("Não matriculado.")
    }

}