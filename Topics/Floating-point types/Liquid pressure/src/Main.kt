fun main() {
    val fluidDensity = readln().toDouble()
    val height = readln().toDouble()
    val gravAcceleration = 9.8
    val liquidPressure = fluidDensity * gravAcceleration * height
    println(liquidPressure)
}