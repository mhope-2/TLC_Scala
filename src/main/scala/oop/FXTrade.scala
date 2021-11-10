package oop

class FXTrade ( id : Int, symbol: String, quantity : Int, price : Double)
  extends Trade (id, symbol, quantity, price) {

  override def isExecutable(): Unit = false

  override def toString: String = "FXTrade"
}
