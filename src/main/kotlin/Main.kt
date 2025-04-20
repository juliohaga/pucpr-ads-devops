package org.example



fun main() {

    val aluno = "Julio H."
    val instituicao = "Pontifícia Universidade Católica do Paraná"
    val curso = "Análise e Desenvolvimento de Sistemas"
    val nota = Nota(0.0, 0.0, 0.0, 0.0).getMedia()
    val disciplina = Disciplina("DevOps", "Felipe Elias")

    println("Aluno: $aluno\n" +
            "Instituição: $instituicao\n" +
            "Curso: $curso\n" +
            "Disciplina: ${disciplina.nome}\n" +
            "Professor: ${disciplina.professor}\n" +
            "Nota do Aluno: $nota")
}