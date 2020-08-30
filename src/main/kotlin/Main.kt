package ru.netology

fun main() {
    val money = 50_000_00
    val amount = 10_000_00
    val minCommission = 3500
    val percentCommission = 0.0075
    val commission: Int = (amount * percentCommission).toInt()
    val result = if (commission < minCommission) minCommission else commission
    val moneyLeft = money - (amount + result)
    println("Перевод выполнен! Остаток денежных средств: $moneyLeft коп., комиссия составила $result коп.")
}