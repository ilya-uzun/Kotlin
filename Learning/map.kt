
fun main() {
// пример массива
    val array = arrayOf(1, 2, 3, 4, 5)
    val result = array.map{ it * 10}
    
    println(result.joinToString( ", "))
    
    
    val map = mapOf(
        "John" to "Audi",
        "Bill" to "BMW",
        "Michael" to "Chevrolet"
        )

    println(map)
    println(map["Bill"])
}


