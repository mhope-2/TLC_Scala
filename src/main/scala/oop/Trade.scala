package oop

import java.time.LocalDateTime

class Trade (var id : Int, var symbol: String, var quantity : Int, var price : Double)  {

  private var _price = price //initialPrice is constructor parameter
  def getPrice = _price //getter method
  def price_=(value: Double) = { if (value >= 0) _price = value } //setter method


  override def toString: String = "Trade{" + "id=" + id + ", symbol='" + symbol + '\'' +
    ", quantity=" + quantity + ", price=" + price + '}'

}
