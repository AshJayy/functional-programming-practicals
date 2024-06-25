object ExpressionEvaluation{
    var k, i, j: Int = 2;
    var m, n: Int = 5;
    var f: Float = 12.0f;
    var g: Float = 4.0f;
    var c: Char = 'X'

    def main(args: Array[String]): Unit = {
        println("k + 12 * m = " + (k + 12 * m));
        println("m / j = " + (m / j));
        println("n % j = " + (n % j));
        println("m / j * j = " + (m / j * j));
        println("f + 10 * 5 + g = " + (f + 10 * 5 + g));
        i += 1;
        println("++i * n = " + (i * n));
    }
}