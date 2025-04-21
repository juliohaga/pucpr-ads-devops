package org.example

import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet

class MySQLManager {
    private val url = "jdbc:mysql://localhost:3306/mdb"
    private val username = "root"
    private val password = ""

    private fun connect(): Connection {
        return DriverManager.getConnection(url, username, password)
    }

    fun getAlunoNome(): String {
        var aluno = ""
        val connection = connect()

        val query = "SELECT nome FROM alunos LIMIT 1"

        val statement = connection.createStatement()
        val resultSet: ResultSet = statement.executeQuery(query)

        if (resultSet.next()) {
            aluno = resultSet.getString("nome")
        }

        resultSet.close()
        statement.close()
        connection.close()

        return aluno
    }
}
