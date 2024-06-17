object WholesaleBookPriceCalc {
    def discount(price: Double): Double = price - price * 2/5
    def shipping(count: Int): Double = if (count < 50) count * 3 else 50 * 3 + (count - 50) * 0.5
    def totalCost(price: Double, count: Int) = discount(price) * count + shipping(count)

    def main(args: Array[String]): Unit = {
        println("Wholesale cost of 60 copies = " + totalCost(24.95, 60))
    }
}
