object Average{
    // def getAvg(num1: Int, num2: Int): Double = BigDecimal((num1 + num2) / 4.0).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    def getAvg(num1: Int, num2: Int): Double = ((num1 + num2) / 2.0 * 100).round / 100.toDouble
    def main(args: Array[String]): Unit = {
        val num1 = 5
        val num2 = 16
        val average = getAvg(num1, num2)
        println(average)
    }
}