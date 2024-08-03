object Main extends App {
  def filterEvenNumbers(n:List[Int]):List[Int] = {
    n.filter(n => n % 2 == 0)
  }

  def readUserInput():List[Int] = {
    println("Enter the numbers:")
    val number = scala.io.StdIn.readLine()
    number.split(" ").map(_.toInt).toList
  }
  val input = readUserInput()
  val output = filterEvenNumbers(input)
  println("Even number list is:" + output.mkString(", "))
}