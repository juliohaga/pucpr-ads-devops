package org.example

class Nota (

    val somativa1 : Double,
    val somativa2 : Double,
    val avaliacao : Double,
    val substitutiva : Double


) {

    fun getMedia(): Double {

        var prova = avaliacao

        if (prova < substitutiva) {

            prova = substitutiva

        }

        val media = (somativa1 * 0.2) + (somativa2 * 0.4) + (prova * 0.4)

        return Math.round(media * 10) / 10.0

    }


}


