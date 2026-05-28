fun main() {
    var number = 123456
    var count = 0

    while (number != 0) {
        number /= 10
        count++
    }

    println("Number of digits: $count")
}
