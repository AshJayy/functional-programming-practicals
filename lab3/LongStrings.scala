object LongStrings{
    def filterLongStrings(strings: List[String]): List[String] = strings.filter(_.length > 5)

    def main(args: Array[String]): Unit = {
        val list = List("Scala", "is", "a", "fun", "Programming", "Language")
        val filtered = filterLongStrings(list)
        println(filtered)
    }
}