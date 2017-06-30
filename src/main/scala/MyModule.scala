object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = s"The absolute value of $x is ${abs(x)}"
    msg

  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n < 0) acc
      else go(n-1, n*acc)

    go(n, 1)
  }



  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}


