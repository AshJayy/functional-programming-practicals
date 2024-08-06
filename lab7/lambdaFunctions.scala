object lambdaFunctions{

    def filterEvenNumbers(numbers: List[Int]): List[Int] = numbers.filter(_ % 2 == 0)

    def calculateSquare(numbers: List[Int]): List[Int] = numbers.map(x => x * x)

    def filterPrime(numbers: List[Int]): List[Int] = numbers.filter(x => (2 until x).forall(y => x % y != 0))

    def main(args: Array[String]): Unit = {

        val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        println("Filtering even numbers")
        val result1 = filterEvenNumbers(input)
        println(result1)

        println("Calculating Squares")
        val result2 = calculateSquare(input)
        println(result2)

        println("Filtering prime numbers")
        val result3 = filterPrime(input)
        println(result3)

    }
}