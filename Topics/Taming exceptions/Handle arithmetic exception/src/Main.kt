fun main() {
    val num = readln().toInt()
    val divisionBy = readln().toInt()
    if (divisionBy == 0) {
        println("Division by zero, please fix the second argument!")
    } else println(num / divisionBy)
}