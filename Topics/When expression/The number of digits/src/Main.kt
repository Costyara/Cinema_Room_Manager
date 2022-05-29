fun main() {
    val num = readln().length
    println(
        when(num) {
            1 -> "1"
            2 -> "2"
            3 -> "3"
            4 -> "4"
            else -> "more than four"
        }
    )
}