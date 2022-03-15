fun main() {
    println("Считаем комиссию...")
    val amount = (1..1_000_000).random()
    val rateCommission = 0.0075
    val minCommission = 3500
    val resultCommission = amount * rateCommission
    val result = if (resultCommission > minCommission) resultCommission else minCommission
    println("Размер комиссии за перевод " + amount.toDouble() / 100
            + " рублей составляет " + result.toInt() + " копеек")
}