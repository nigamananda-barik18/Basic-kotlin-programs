fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..n / 2) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    val n = 50

    println("Prime numbers from 1 to $n are:")

    for (i in 1..n) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
}
