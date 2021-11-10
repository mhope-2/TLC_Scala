package oop

import java.time.LocalDateTime

object SingObj extends App{

    val trade = new Trade(1, "USD", 12, 200.55)

     println(trade.getPrice)

}
