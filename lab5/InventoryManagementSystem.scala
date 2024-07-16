import scala.io.StdIn.readLine

object InventoryManagementSystem{

    def getProductList(items: List[String]): List[String] = {
        val product: String = readLine()
        (product) match {
            case "done" => items
            case _ => getProductList(items :+ product)
        }
    }

    def printProductList(items: List[String], idx: Int = 1): Unit = (items) match {
        case Nil =>
        case (item :: rest) =>
            println(s"$idx $item")
            printProductList(rest, idx + 1)
    }

    def getTotalProducts(items: List[String]): Int = {
        return items.length
    }

    def main(args: Array[String]): Unit = {
        var items: List[String] = List();

        items = getProductList(items)
        println("Products List")
        printProductList(items)
        val noOfProducts = getTotalProducts(items)
        println(s"number of products: $noOfProducts")

    }
}