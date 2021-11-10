package oop

object Solution {

  def convertStringToDate(stringDate: String) = {
    val date = stringDate.split("/")
    var day = date(0)
    val month = date(1)
    val year = date(2)


    if(day.endsWith("1") && day != "11"){
      day += "st"
    } else if(day.endsWith("2") && day != "12"){
      day += "nd"
    } else if (day.endsWith("3") && day != "13"){
      day += "3rd"
    } else{
      day += "th"
    }



  }
}
