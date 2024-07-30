object Inventory6{

    def getNames(inventory: List[Map[String, String]]): Unit = (inventory) match {
        case (Nil) =>
        case(item::rest) => {
            item.get("name") match {
                case Some(name) => println(name)
                case None => 
            }
            getNames(rest)
        }
    }

    def getTotalValue(inventory: List[Map[String, String]], sum: Int = 0): Int = inventory match {
        case Nil => sum 
        case item :: rest => {
            item.get("price") match {
                case Some(price) => getTotalValue(rest, sum + price.toInt)
                case None => getTotalValue(rest, sum) 
            }
        }
    }

    def isEmpty(inventory: List[Map[String, String]]): Boolean = inventory match {
        case Nil => true
        case _ => false
    }

    def mergeInventories(inventory1: List[Map[String, String]], inventory2: List[Map[String, String]]): List[Map[String, String]] = {
        val combined = (inventory1 ++ inventory2).groupBy(_("id")).map { case (id, items) =>
            val name = items.head("name")
            val totalQty = items.map(_("qty").toInt).sum
            val maxPrice = items.map(_("price").toInt).max
            Map("id" -> id, "name" -> name, "qty" -> totalQty.toString, "price" -> maxPrice.toString)
        }
        combined.toList
    }

    def findProductById(inventory: List[Map[String, String]], productId: String): Unit = {
        val product = inventory.find(item => item.get("id").contains(productId))
        product match {
            case Some(details) => println(details)
            case None => println(s"Product with ID $productId not found.")
        }
    }


    def main(args: Array[String]): Unit = {
        var inventory1: List[Map[String, String]] = List(
            Map("id" -> "001", "name" -> "Banana", "qty" -> "10", "price" -> "20"),
            Map("id" -> "002", "name" -> "Apple", "qty" -> "5", "price" -> "15"),
            Map("id" -> "003", "name" -> "Orange", "qty" -> "20", "price" -> "25"),
            Map("id" -> "004", "name" -> "Mango", "qty" -> "12", "price" -> "30")
        )

        var inventory2: List[Map[String, String]] = List(
            Map("id" -> "001", "name" -> "Banana", "qty" -> "5", "price" -> "25"),
            Map("id" -> "002", "name" -> "Apple", "qty" -> "5", "price" -> "15"),
            Map("id" -> "003", "name" -> "Orange", "qty" -> "10", "price" -> "20"),
            Map("id" -> "004", "name" -> "Mango", "qty" -> "13", "price" -> "35")
        )

        println("Product names of inventory 1")
        getNames(inventory1)

        println("Total value of inventory 1")
        println(getTotalValue(inventory1))

        println("Merge inventory 1 with inventory 2")
        mergeInventories(inventory1, inventory2)

        println("Check for a product with ID 001")
        findProductById(inventory1, "001")

    }
}