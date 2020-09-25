package br.com.digitalhouse.desafio

class Principal {
    fun main(){
        val digitalHouseManager = DigitalHouseManager()

        //registrando professores titulares
        digitalHouseManager.registrarProfessorTitular("Clark", "Kent", 100, "JavaScript")
        digitalHouseManager.registrarProfessorTitular("Bruce", "Wayne", 101, "Kotlin")


        //registrando professores adjuntos
        digitalHouseManager.registrarProfessorAdjunto("Barry", "Allen", 200, 2)
        digitalHouseManager.registrarProfessorAdjunto("Bart", "Simpson", 203, 5)

        //registrando cursos
        digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
        digitalHouseManager.registrarCurso("Android", 20002, 2)

        //alocando professores
        digitalHouseManager.alocarProfessores(20001, 100, 200)
        digitalHouseManager.alocarProfessores(20002, 101, 201)

        //registrando alunos
        digitalHouseManager.registrarAluno("Bruno", "Ribeiro", 1)
        digitalHouseManager.registrarAluno("Tony", "Stark", 2)
        digitalHouseManager.registrarAluno("Mulher", "Maravilha", 3)
        digitalHouseManager.registrarAluno("Feiticeira", "Escarlate", 4)
        digitalHouseManager.registrarAluno("Steve", "Rogers", 5)

        //matriculando alunos
        digitalHouseManager.matricularAluno(1, 20001)
        digitalHouseManager.matricularAluno(2, 20001)
        digitalHouseManager.matricularAluno(3, 20002)
        digitalHouseManager.matricularAluno(4, 20002)
        digitalHouseManager.matricularAluno(5, 20002)


        //caso o aluno queira consultar
        digitalHouseManager.consultarCurso(2)



    }
}