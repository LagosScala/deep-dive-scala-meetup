/**
  * Introduction to case class concepts in Scala
  * String interpolation in Scala
  * @param name
  */

case class Greeter(name : String)

object HelloWorld extends App {

  val name = "Lagos Scala"

  val myName =  "Olushola"

  val cClass = Greeter(name)

  println(cClass)

  println(s"Hello World $name, $myName")

  println("Hello World " + name + " " +  "," + " " + myName)

}
