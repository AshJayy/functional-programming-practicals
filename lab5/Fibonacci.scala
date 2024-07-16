object Fibonacci{

    def fibonacci(n: Int): Int = n match {
        case 0 => 0
        case 1 => 1
        case _ => fibonacci(n - 1) + fibonacci(n - 2)
    }

    def fibonacciSeries(n: Int): List[Int] = {
        (0 until n).toList.map(fibonacci)
    }

    def main(args: Array[String]): Unit = {
        val n = 10
        val series = fibonacciSeries(n)

        println(s"Fibonacci series up to the $n-th element:")
        println(series.mkString(", "))
    }
}