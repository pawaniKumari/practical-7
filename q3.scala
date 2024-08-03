object Main extends App{
    def isPrime(n:Int):Boolean = {
        if(n <= 1) false
        else if (n==2) true
        else !(2 until n).exists((i => n % i ==0))
    }

    def filterPrime(numbers:List[Int]):List[Int] = {
        numbers.filter(num => isPrime(num))
    }

    def readUserInput():List[Int] = {
        println("Enter numbers:")
        val n = scala.io.StdIn.readLine()
        n.split(" ").map(_.toInt).toList
    }

    val input = readUserInput()
    val output = filterPrime(input)
    println("Prime numbers are:" + output.mkString(", "))
    
}