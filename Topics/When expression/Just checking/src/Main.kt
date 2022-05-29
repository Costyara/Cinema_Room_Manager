fun main() {
//    println("Which programming language are you learning?\n" +
//            "\n" +
//            "1.Java\n" +
//            "2.Kotlin\n" +
//            "3.Scala\n" +
//            "4.Python")
    println(when(readln().toInt()) {
        2 -> "Yes!"
        1, 3, 4 -> "No!"
        else -> "Unknown number"
    })
}