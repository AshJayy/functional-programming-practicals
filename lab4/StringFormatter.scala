object StringFormatter {

    def toUpper(input: String): String = input.toUpperCase

    def toLower(input: String): String = input.toLowerCase

    def formatNames(name: String, formatFunc: String => String): String = formatFunc(name)

    def main(args: Array[String]): Unit = {
        val names = List("Benny", "Niroshan", "Saman", "Kumara")

        names.foreach { name =>
            println(s"Original: $name")
            println(s"Uppercase: ${formatNames(name, toUpper)}")
            println(s"Lowercase: ${formatNames(name, toLower)}")
            println()
        }
    }
}
