fun main() {
    val mutListString = mutableListOf(
        mutableListOf<String>("A", "R", "R", "A", "Y")
    )
    print(mutListString[0].joinToString())    // A, R, R, A, Y
}