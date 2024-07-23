import scala.io.StdIn.readLine
object PatternMatching {

    def getMod(n: Int): Int = n % 2
    def isOddEven(n: Int): Unit = {
        if (n <= 0){
            println("Negative/Zero")
        }else{
            (getMod(n) match {
                case 0 => println("An even number is given")
                case 1 => println("An odd number is given")
            })
        }
    }
    def main (args: Array[String]): Unit = {
        var input = readLine()
        isOddEven(input.toInt)
    }
}