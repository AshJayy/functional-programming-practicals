object TempConverter {
    def toF(c: Double): Double = c  * 1.8 + 32

    def main(args: Array[String]): Unit = {
        println("30C in Fahrenheit = " + toF(30))
    }
}
