object Main extends App{
    def calculateSquare(n:List[Int]):List[Int] = {
        n.map(num => num * num)
    }

    def readUserInput():List[Int] = {
        println("Enter numbers:")
        val number = scala.io.StdIn.readLine()
        number.split(" ").map(_.toInt).toList
    }

    val input = readUserInput()
    val output = calculateSquare(input)
    println("Square of the numbers are:" + output.mkString(", "))
}