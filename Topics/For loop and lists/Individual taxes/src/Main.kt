fun main() {
    val numOfCompanies = readln().toInt()
    val listIncome = MutableList(numOfCompanies) { readln().toFloat() }
    val taxPercentList = MutableList(numOfCompanies) { readln().toFloat() }
    val taxPay = mutableListOf<Float>()
    for (index in listIncome.indices) {
        taxPay.add(listIncome[index] / 100f * taxPercentList[index])
    }
    println(taxPay.indexOf(taxPay.maxOrNull()) + 1)
    //println(taxPay)
}