fun main(args: Array<String>) {
    println ("Введите число")
    val size = readLine()!!.toInt() // !!.toInt() - преобразование из Strung
    println ("\n")

    // Инициализация массива способ 1
    // var arrayRandom = Array (size, {(0 until 10).random()})
    // for ((index, value) in arrayRandom.withIndex()) {
    //     print("$value")
    // } 
    
    // Инициализация массива способ 1
    var arrayRandom = Array (size, {(0 until 10).random()})
    for (i in arrayRandom.indices) {
        print("${arrayRandom[i]} ")
    }
}
