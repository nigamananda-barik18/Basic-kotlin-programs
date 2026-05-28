fun main() {
    var a = 10
    var b = 20

    println("Before swapping: a = $a, b = $b")

    a = a + b
    b = a - b
    a = a - b

    println("After swapping: a = $a, b = $b")
}
