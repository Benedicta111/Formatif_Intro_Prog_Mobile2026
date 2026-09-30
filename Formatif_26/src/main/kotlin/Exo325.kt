package org.akpo

fun joursParMois(n: Int): List<Int> {

    if (n > 12) {
        throw IllegalArgumentException("Il ne peut pas y avoir plus de 12 mois")
    }

    val jours = listOf(
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    )

    val resultat = mutableListOf<Int>()

    for (i in 0 until n) {
        resultat.add(jours[i])
    }

    return resultat
}

fun tri(liste: List<Double>): List<Double> {
    return liste.sorted()
}

fun main() {

    println(joursParMois(1))
    println(joursParMois(7))
    println(joursParMois(12))

    val nombres = listOf(5.5, 9.0, 2.1, 1.2)

    println(tri(nombres))

    println(joursParMois(13))
}