package org.example

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    private var somativa1: Double = 0.0
    private var somativa2: Double = 0.0
    private var avaliacao: Double = 0.0
    private var substitutiva: Double = 0.0
    private var mediaEsperada: Double = 0.0
    private lateinit var disciplina: Disciplina
    private lateinit var nota: Disciplina.Nota

    @BeforeEach
    fun setup() {
        somativa1 = 0.0
        somativa2 = 0.0
        avaliacao = 0.0
        substitutiva = 0.0
        mediaEsperada = 0.0
        disciplina = Disciplina("DevOps", "Felipe Elias")
        nota = Disciplina.Nota(somativa1, somativa2, avaliacao, substitutiva)
    }

    fun verificarNome(disciplina: Disciplina, nomeEsperado: String) {
        assertEquals(nomeEsperado, disciplina.nome, "O nome da disciplina deveria ser $nomeEsperado")
    }

    fun verificarProfessor(disciplina: Disciplina, professorEsperado: String) {
        assertEquals(professorEsperado, disciplina.professor, "O professor deveria ser $professorEsperado")
    }

    fun verificarMedia(nota: Disciplina.Nota, mediaEsperada: Double) {
        val mediaCalculada = nota.getMedia()
        assertEquals(mediaEsperada, mediaCalculada, "A média calculada deveria ser $mediaEsperada")
    }

    @Test
    fun testDisciplinaNome() {
        verificarNome(disciplina, "DevOps")
    }

    @Test
    fun testDisciplinaProfessor() {
        verificarProfessor(disciplina, "Felipe Elias")
    }

    @Test
    fun testNotaComMedia() {
        verificarMedia(nota, mediaEsperada)
    }

    @Test
    fun testNotaComSubstitutiva() {
        substitutiva = 5.0
        mediaEsperada = 2.0
        nota = Disciplina.Nota(somativa1, somativa2, avaliacao, substitutiva)
        verificarMedia(nota, mediaEsperada)
    }

    @Test
    fun testNotaComAvaliacoesIguais() {
        avaliacao = 8.0
        substitutiva = 8.0
        mediaEsperada = 3.2
        nota = Disciplina.Nota(somativa1, somativa2, avaliacao, substitutiva)
        verificarMedia(nota, mediaEsperada)
    }
}
