object Inventory{

    var itemNames: Array[String] = Array("Banana", "Apple", "Orange")
    var itemQuantities: Array[Int] = Array(5, 3, 6)

    def displayInventory(n: Int = 0): Unit = {
        if (n < itemNames.length) {
            println(s"${itemNames(n)}: ${itemQuantities(n)}")
            displayInventory(n + 1)
        }
    }

    def restockItem(item: String, qty: Int, n: Int = 0): Unit = {
        if (n < itemNames.length) {
            if(item == itemNames(n)){
                itemQuantities(n) += qty
            }else{
                restockItem(item, qty, n + 1)
            }
        }
    }

    def sellItem(item: String, qty: Int, n: Int = 0): Unit = {
        if (n < itemNames.length) {
            if(item == itemNames(n)){
                itemQuantities(n) -= qty
            }else{
                sellItem(item, qty, n + 1)
            }
        }
    }

    def main( ards: Array[String]): Unit = {
        restockItem("Apple", 2)
        displayInventory()
        sellItem("Banana", 1)
        displayInventory()

    }
}