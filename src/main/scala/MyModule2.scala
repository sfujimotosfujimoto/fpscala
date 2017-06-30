object MyModule2 {
  def abs(n:Int):Int = {
    if (n < 0) -n
    else n

  }
    
  private def formatAbs(x:Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def factorial(n:Int): Int = {
    @annotation.tailrec
    def go(n:Int, acc:Int):Int = {
      if(n<=0) acc
      else go(n-1, n*acc)
    }
    go(n, 1)
  }

  private def formatFactorial(n:Int) = {
    val msg = "The factorial of %d is %d."
    msg.format(n, factorial(n))
  }

  def formatResult(name:String, n:Int, f:Int => Int) = {
    val msg = "This %s of %d is %d"
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]):Unit = {
    println(formatAbs(-42))
    println(factorial(12))

  }
   }

