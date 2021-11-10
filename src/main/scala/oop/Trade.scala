package oop

import java.time.LocalDateTime

abstract class Trade (var id : Int, var symbol: String, var quantity : Int, var price : Double)  {

  private var _price = price //initialPrice is constructor parameter

  def getPrice = _price //getter method

  def setPrice_=(value: Double) = { if (value >= 0) _price = value } //setter method

  def value = quantity * price

  def isExecutable()

  override def toString: String = "Trade{" + "id=" + id + ", symbol='" + symbol + '\'' +
    ", quantity=" + quantity + ", price=" + price + '}'

}

object Trade{
//  def apply(id : Int, symbol: String, quantity : Int, price : Double)  = new Trade(id, symbol, quantity, price)

  override def hashCode(): Int = super.hashCode()

  override def equals(obj: Any): Boolean = super.equals(obj)

  override def toString: String = super.toString
}