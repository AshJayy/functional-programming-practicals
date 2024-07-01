object EvenSum{
    def sumOfEvenNumbers(numbers: List[Int]): Int = numbers.filter(_ % 2 == 0).sum

    def main(args: Array[String]): Unit = {
        val inputList = List(1, 2, 3, 4, 5, 6)
        val result = sumOfEvenNumbers(inputList)
        println(result)
    }
}