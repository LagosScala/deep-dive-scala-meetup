object ScalaMethods extends App{
  val x = 5
  val y = 3
  def sumNumbers(x : Int, y : Int) : Unit = {
    val sum = x + y
    println(sum)
  }
  sumNumbers(x,y)
}
