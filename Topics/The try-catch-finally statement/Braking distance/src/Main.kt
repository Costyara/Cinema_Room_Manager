import kotlin.Exception

fun calculateBrakingDistance(v1: String, a: String): Int {
    try {
        return (0 - v1.toInt() * v1.toInt()) / (2 * a.toInt())
    } catch (e: ArithmeticException) {
        println("The car does not slow down!")
    } catch (e: Exception) {
        println(e.message)
    }
    return -1
}