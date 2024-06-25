object JavaScalaComparision{
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f

    def main(args: Array[String]): Unit = {
        // a
        b -= 1;
        println("- -b * a + c *d - -" + (b * a + c * d));
        d -= 1;

        // b
        println("a++" + a);
        a += 1;

        // c
        println("-2 * (d - k) + c" + (-2 * (d - k) + c));

        // d
        println("c = c++" + c)
        c += 1;

        // e
        c += 1;
        println("c = ++c * a ++" + (c * a))
        a += 1;
    }
}