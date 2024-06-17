object JogTimeCalculator {
    def easyTime(distance: Double): Double = distance * 8
    def tempoTime(distance: Double): Double = distance * 7
    def totalTime(easy1: Double, tempo: Double, easy2: Double): Double = easyTime(easy1) + tempoTime(tempo) + easyTime(easy2)

    def main(args: Array[String]): Unit = {
        println("Total running time (2, 3, 2): " + totalTime(2, 3, 2) + " mins")
    }
}
