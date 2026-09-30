package org.akpo
import org.jsoup.Jsoup
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   val url=" https://info.cegepmontpetit.ca/3M5-Intro-Mobile/testbot/lotr.html"
   val doc=Jsoup.connect(url).get()
   val img=doc.getElementsByTag("img")

   for(image in img)
   {
      val src =image.attr("src")
      val alt =image.attr("alt")

      println(src+"  >>  "+alt)
   }

}