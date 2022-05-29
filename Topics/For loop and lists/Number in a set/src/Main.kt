fun main() {
    val size = readln().toInt()
    val list = MutableList(size) { readln().toInt() }
    val num = readln().toInt()
    println(if (list.contains(num))"YES" else "NO")
}