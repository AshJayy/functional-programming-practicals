object Theatre{
    def attendees(price: Int): Int = 120 + ((price - 15) / 5 * 20);
    def cost(attendeeCount: Int): Double = 500 + attendeeCount * 3
    def profit(price: Int): Double = price * attendees(price) - cost(attendees(price))
    def main(args: Array[String]): Unit = {
        println(profit(25))
    }
}