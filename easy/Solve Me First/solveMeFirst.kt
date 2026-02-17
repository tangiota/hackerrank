import java.util.*

fun solveMeFirst(a: Int, b: Int): Int {
    var sum = 0;
    if (a > 0 && a <= 1000 ) {
        if (b > 0 && b <= 1000) {
        sum = a + b;
        }
    }
    return sum;
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}
