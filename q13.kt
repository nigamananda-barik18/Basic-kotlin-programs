fun calculateSimpleInterest(principal: Double, rate: Double, time: Double): Double {
    return (principal * rate * time) / 100
}

fun main() {
    val p = 1000.0   // Principal amount
    val r = 5.0      // Rate of interest
    val t = 2.0      // Time in years

    val si = calculateSimpleInterest(p, r, t)

    println("Simple Interest: $si")
}

