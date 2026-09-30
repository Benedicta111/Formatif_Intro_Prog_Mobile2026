package org.akpo
import java.io.File
fun main(args: Array<String>){
    val fichier=File(args[0])
    var lignes=fichier.readText()
    var somme=0;
    for(ligne in lignes){
        println(ligne)
        var nombre=ligne.digitToIntOrNull()

        if(nombre!=null){
            somme+=nombre
        }

    }
    println("Somme = $somme")
}