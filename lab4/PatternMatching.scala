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
    def getModThree(n: Int): Int = n % 3
    def isMultipleThree(n: Int): Unit = {
        if (n <= 0){
            println("Negative/Zero")
        }else{
            if(getMod(n) == 1){
                println("Is a multiple of 3")
            }else{
                println("Not a multiple of 3")
            }
        }
    }
    def main (args: Array[String]): Unit = {
        println("Enter a number")
        var input = readLine()
        // isOddEven(input.toInt)
        isMultipleThree(input.toInt)
    }
}