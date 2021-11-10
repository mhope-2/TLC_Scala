package oop

class Transaction ( id : Int, symbol: String, quantity : Int, price : Double)
  extends EquityTrade (id, symbol, quantity, price)
  with Taxable with FeePayable {

  override def tax_rate(): Unit = 12.5

  override def flatFee(): Unit = 10.00

  def amount() : Double = (0.01 * this.tax_rate()) * (this.value + flatFee())
}
