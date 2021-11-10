package pattern_matching

object Library {

  def main (args: Array[String]): Unit = {
    println(borrow("senior citizen"))
  }

  def borrow(membershipType: String) : String = {
    membershipType match {
      case "junior" => "can borrow 2 books"
      case "regular" => "can borrow 4 books"
      case "senior citizen" => "can borrow 6 books"
    }
  }

}
