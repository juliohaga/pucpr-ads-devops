package org.example

fun main() {
    // Criando uma instância do gerenciador MySQL
    val mysqlManager = MySQLManager()

    // Pegando o nome do aluno do MySQL
    val aluno = mysqlManager.getAlunoNome()

    val instituicao = Curso.instituicao()
    val curso = Curso.getName()
    val nota = Disciplina.Nota(0.0, 0.0, 0.0, 0.0).getMedia()
    val disciplina = Disciplina("DevOps", "Felipe Elias")

    println("Aluno: $aluno \nInstituição: $instituicao \nCurso: $curso \nDisciplina: ${disciplina.nome} \nProfessor: ${disciplina.professor} \nNota do Aluno: $nota\n")
}
