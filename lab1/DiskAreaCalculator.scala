object DiskAreaCalculator {
    def areaOfDisk(r: Double): Double = math.Pi * r * r

    def main(args: Array[String]): Unit = {
        println("Area ofa disk with radius 5 = " + areaOfDisk(5))
    }
}
