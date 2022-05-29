fun main() {  
    val beyondTheWall = readLine()!!.split(", ").map { it }.toMutableList().sorted()
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList().sorted()
    println(beyondTheWall == backToTheWall)
}