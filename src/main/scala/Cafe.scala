

class CreditCard {
  def charge(n:Int) {
   println("charged: " + n  + " dollars on the cc") 
  }
}

class Coffee(val price:Int){
  override def toString = s"Coffee: price - $price"
}



class Cafe {

  def buyCoffee(cc: CreditCard):Coffee = {
    val cup = new Coffee(12)

    cc.charge(cup.price)
    cup

  }
}

val cafe = new Cafe
val cc = new CreditCard
val coffee = new Coffee(14)

println(cafe.buyCoffee(cc))
