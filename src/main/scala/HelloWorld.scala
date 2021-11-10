import java.time.LocalDate
import java.time.format.DateTimeFormatter

object HelloWorld {

  def main(args: Array[String]): Unit ={
    println("Hello World")

    println(toFahrenheit(23.5))

    println(formatDate())

    println(regexes("root:x:0:0:/root:/bin/bash"))

  }

  // Q1. function to convert celsius to fahrenheit

  def toFahrenheit(temperatureInDegreeCelsius : Double): Double =  (temperatureInDegreeCelsius * 9/5 ) + 32


  // Q2.
  def formatDate(): String = {

    import java.time.LocalDate
    val date = LocalDate.now()

    val customFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy")
    val text = customFormatter.format(date)

    text
  }

  def regexes(linux_pass :String) = {
    val linux_passwords = raw"(\S+):(\S):(\d):(\d):/(\S+):/(\S+)/(\S+)".r

    linux_pass match {
      case linux_passwords(username, password, userid, groupid, description,
      home_directory, shell) =>
        s"username : $username, password: $password, userid: $userid, groupid: $groupid," +
          s"description: $description, home_dir: $home_directory, shell: $shell"
    }

  }

}
