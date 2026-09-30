package org.akpo

import org.jsoup.Jsoup
fun main(){
    val url = "https://info.cegepmontpetit.ca/3M5-Intro-Mobile/testbot/courrielsDansA.html"

    val document = Jsoup.connect(url).get()

    val courriels = document.getElementsByTag("a")

    for (c in courriels) {
        val nom=c.text()
        val lien=c.attr("href")
        if (lien.startsWith("mailto:")) {

            val courriel = lien.replace("mailto:", "")

            println("$nom a pour courriel $courriel")
        }

}

}