package oop

class EquityTrade ( id : Int, symbol: String, quantity : Int, price : Double)
  extends Trade (id, symbol, quantity, price) {

  override def isExecutable(): Boolean = true

  override def toString: String = "EquityTrade"
}
