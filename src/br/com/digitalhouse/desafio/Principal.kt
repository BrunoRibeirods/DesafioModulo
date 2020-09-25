package br.com.digitalhouse.desafio

class Principal {
    fun main(){
        val professorTitular = ProfessorTitular(
            "Vitoria",
            "Gonçalves",
            0,
            1001,
            "Kotlin"
        )
        val professorAdjunto = ProfessorAdjunto(
            "Bruno",
            "Ribeiro",
            0,
            1002,
            5
        )
        val aluno1 = Aluno("Ederson", "America", 1)
        val aluno2 = Aluno("Bruce", "Wayne", 2)
        val aluno3 = Aluno("Barry", "Allen", 3)

        val listaAlunos = mutableListOf<Aluno>()
        val listaProfessores = mutableListOf<Professor>()
        val listaCursos = mutableListOf<Curso>()
        val listaMatricula = mutableListOf<Matricula>()

        val curso1 = Curso(
            "Full Stack",
            20001,
            professorTitular,
            professorAdjunto,
            3,
            listaAlunos
        )

        val curso2 = Curso(
            "Android",
            20002,
            professorTitular,
            professorAdjunto,
            2,
            listaAlunos
        )

        val digitalHouseManager = DigitalHouseManager(listaAlunos, listaProfessores, listaCursos, listaMatricula)

        digitalHouseManager.registrarCurso(curso1)
        digitalHouseManager.registrarCurso(curso2)

        
    }
}