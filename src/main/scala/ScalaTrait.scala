trait ScalaTrait {

  def sum(x : Int, y : Int)

  def division( x : Int, y : Int)

  def multiplication( x : Int, y : Int)

}

object Solution extends App with ScalaTrait {
  val x = 10
  val y = 5
  override def sum(x: Int, y: Int): Unit = {
    val result = x + y
    println(result)
  }

  override def division(x: Int, y: Int): Unit = {
    val result = x / y
    println(result)
  }

  override def multiplication(x: Int, y: Int): Unit = {
    val result = x * y
    println(result)
  }

  Solution.division(x,y)
  Solution.sum(x,y)
  Solution.multiplication(x,y)
}
