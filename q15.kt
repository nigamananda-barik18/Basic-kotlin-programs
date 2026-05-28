fun main() {
    val n = 10

    var first = 0
    var second = 1

    println("Fibonacci series up to $n terms:")

    for (i in 1..n) {
        print("$first ")

        val next = first + second
        first = second
        second = next
    }
}
