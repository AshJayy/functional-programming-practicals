import scala.io.StdIn.readLine
object ReverseString{

  def reverseString(s: String): String = {
    if (s.isEmpty) ""
    else reverseString(s.tail) + s.head
  }

  def main(args: Array[String]): Unit = {
    println("Enter your word:")

    val input = readLine()
    val reversed = reverseString(input)

    println(s"Original: $input")
    println(s"Reversed: $reversed")
  }
}