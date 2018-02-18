
object SequenceExample extends App{

  //create a sequence
  val number = Seq(1,2,3,4,5,6,7,8,9,0)

  //given the sequence above lets create a phone number from the sequence that would equal (123) 456-7890

  def solutionOne(numbers: Seq[Int]) : String = {
    val numberProcessor = numbers.mkString
    val interpolatedResult = s"(${numberProcessor.slice(0,3)}) ${numberProcessor.slice(3,6)}-${numberProcessor.slice(6,10)}"
    println(interpolatedResult)
    interpolatedResult

  }

  def solutionTwo(numbers : Seq[Int]) : String = {
    val processor = numbers.mkString
    val interpolatedResult = s"(${processor.take(3)}) ${processor.drop(3).take(3)}-${processor.drop(6).take(10)}"
    println(interpolatedResult)
    interpolatedResult
  }

  def solutionThree(numbers : Seq[Int]) : String = {
    var no = "("
    for(i <-  numbers.indices) {
      if( i < 1) no += "" + numbers(i)
      else if(i == 2) no += "" + numbers(i) + ") "
      else if(i == 5) no += "" + numbers(i) + "-"
      else no += "" + numbers(i)
    }
    println(no)
    no
  }



  solutionOne(number)
  solutionTwo(number)
  solutionThree(number)

}
