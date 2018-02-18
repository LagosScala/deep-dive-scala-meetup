/**
  * Introduction to basic concepts of Scala Arrays
  */
object ScalaArrays extends App {

  val oranges = Array(1,2,3,4,5,6,7,8)

  //loop through the index of an array and returns a collection
  val solutionOne = for(i <- oranges.indices) yield { println(s" Solution 1 is $i ") }

  val solutionTwo : Unit = oranges.foreach(i => println(s"Results from Solution 2 is $i"))

  val solutionThree : Unit = for(x <- 1 to oranges.length) println(s"Solution 3 is $x")

  // manipulating results from the previous loop

  val solutionOneMultiplied = for(i <- oranges.indices) yield { println( i * 2) }

  val solutionTwoMultiplied : Unit = oranges.foreach(i => println( i * 2))

  val solutionThreeMultiplied  : Unit = for(x <- 1 to oranges.length) println(x * 2)
}
