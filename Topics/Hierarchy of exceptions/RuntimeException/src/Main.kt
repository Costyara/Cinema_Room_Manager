fun main() {
    try {
    val a = 2 / 0
    } catch(e: RuntimeException) {
        println("Well")
    } catch (e: Exception) {
        println("Wrong")
    }
}