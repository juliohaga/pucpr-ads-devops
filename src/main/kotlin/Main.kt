package org.example



fun main() {

    val aluno = "Julio H."
    val instituicao = "Pontifícia Universidade Católica do Paraná"
    val curso = "Análise e Desenvolvimento de Sistemas"
    val disciplina = "DevOps"
    val professor = "Felipe Elias"
    val nota = Nota(0.0, 0.0, 0.0,0.0).getMedia()

    println("Aluno: $aluno\n" +
            "Instituição: $instituicao\n" +
            "Curso: $curso\n" +
            "Disciplina: $disciplina\n" +
            "Professor: $professor\n" +
            "Nota do Aluno: $nota")
}