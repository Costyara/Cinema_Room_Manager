fun main() {
    val size = readln().toInt()
    val list = mutableListOf<Int>()
    for (num in 0 until size) {
        list.add(readln().toInt())
    }
    println(list.indexOf(list.maxOrNull()))
}