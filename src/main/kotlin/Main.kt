package org.example

fun main() {

    val aluno = "Julio H."
    val instituicao = Curso.instituicao()
    val curso = Curso.getName()
    val nota = Disciplina.Nota(0.0, 0.0, 0.0, 0.0).getMedia()
    val disciplina = Disciplina("DevOps", "Felipe Elias")

    println("Aluno: $aluno \nInstituição: $instituicao \nCurso: $curso \nDisciplina: ${disciplina.nome} \nProfessor: ${disciplina.professor} \nNota do Aluno: $nota\n")
}
