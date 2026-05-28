fun findLargest(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}

fun main() {
    val num1 = 10
    val num2 = 25
    val num3 = 15

    val largest = findLargest(num1, num2, num3)

    println("Largest number is $largest")
}
