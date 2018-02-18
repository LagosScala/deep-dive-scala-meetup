
object ScalaCurrying extends App{

  val firstNumber = 5

  val secondNumber = 10

  def sumNumber(x: Int)(y : Int) : Unit = print( x + y)

  val currying = sumNumber(firstNumber)_

  currying(secondNumber)

  println(currying)


}
