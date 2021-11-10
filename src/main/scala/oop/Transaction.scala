package oop

class Transaction ( id : Int, symbol: String, quantity : Int, price : Double)
  extends EquityTrade (id, symbol, quantity, price)
  with Taxable with FeePayable {



}
