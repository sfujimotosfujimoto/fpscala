
object Ex2 extends App {
  
  def fib(n:Int):Int = n match{
    case 0 => 0
    case 1 => 1
    case n => fib(n - 1) + fib(n - 2)
  }

  println("Hello world")
}

