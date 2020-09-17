fun main() {
    val amount = 10_000
    val commission = 0.0075
    val commissionMin = 35

    val commissionAmount = amount * commission
    val result = if (commissionAmount > commissionMin) {
        commissionAmount
    } else {
        commissionMin
    }
    println("Комиссия за перевод $result")
}