fun sumOfNumbers(n: Int): Int {
    var sum = 0

    for (i in 1..n) {
        sum += i
    }

    return sum
}

fun main() {
    val n = 10
    println("Sum from 1 to $n is ${sumOfNumbers(n)}")
}

