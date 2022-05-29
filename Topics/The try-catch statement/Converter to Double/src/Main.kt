fun convertStringToDouble(input: String): Double {
    /**
    * It returns a double value or 0 if an exception occurred
    */
    return try {
        input.toDouble()
    }
    catch 1 (e: Exception){
        0.0
    }
    catch 2 (e: Exception){
        0.0
    }
}