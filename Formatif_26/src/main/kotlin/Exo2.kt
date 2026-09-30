package org.akpo

fun main(){
    lireNombre()
}



fun lireNombre() : Int{
    while(true)
    {
        println("Veuillez entrer votre nombre entier : ")
        var lecture= readln()
        var nombre=lecture.toIntOrNull()
        if(nombre!=null)
        {
            return nombre
        }


    }
}