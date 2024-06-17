object SphereVolumeCalculator {
    def volumeOfSphere(r: Double) = 4/3 * math.Pi * r * r * r

    def main(args: Array[String]): Unit = {
        println("Volume of a sphere with radius 5 = " + volumeOfSphere(5))
    }
}
