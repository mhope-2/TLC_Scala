package functional_scala

object Arithmetic {

  def main(args: Array[String]): Unit = {
      println(arithmeticOperation("power"))
  }

  def arithmeticOperation(operation: String) ={
    val firstInt: Int = 4
    val secondInt: Int = 5

    operation match {
      case "add" => s"$firstInt + $secondInt =  ${firstInt + secondInt} "
      case "subtract" =>  s"$firstInt - $secondInt =  ${firstInt - secondInt}"
      case "power" => s"$firstInt ^ $secondInt = ${scala.math.pow(firstInt, secondInt)}"
    }

  }

}
