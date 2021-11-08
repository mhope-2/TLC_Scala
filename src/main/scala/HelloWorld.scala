import java.time.{LocalDate}
import java.text.SimpleDateFormat
import java.util.Locale
import java.text.DateFormat

object HelloWorld {

  def main(args: Array[String]): Unit ={
    println("Hello World")

    println(toFahrenheit(23.5))

    //    println(LocalDate.of(2020, 1, 12))

    println(formatDate("21/09/1926"))
  }

  // Q1. function to convert celsius to fahrenheit

  def toFahrenheit(temperatureInDegreeCelsius : Double): Double = {
    return (temperatureInDegreeCelsius * 9/5 ) + 32
  }

  // Q2.
  def formatDate(sourceDate : String): String = {
    val originalFormat = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH)
    val targetFormat = new SimpleDateFormat("dd MMMM yyyy")
    val date = originalFormat.parse(sourceDate)
    return targetFormat.format(date)
  }

}
