fun main(args: Array<String>) {
    println ("Введите число")
    var size = readLine()!!.toInt() // !!.toInt() - преобразование из Strung
    println ("\n")

    // Инициализация массива способ 1
    // var arrayRandom = Array (size, {(0 until 10).random()})
    // for ((index, value) in arrayRandom.withIndex()) {
    //     println("$index - $value ")
    // } 

    // Инициализация массива способ 1
    var arrayRandom = Array (size, {(0 until 10).random()})

    for (i in arrayRandom.indices) {
        print("${arrayRandom[i]} ")
    }

    for (i < (size - 1)){
        for (j > (size + 1))
            if(arrayRandom[j] > arrayRandom[j]){
                var tepm = arrayRandom[j] 
                arrayRandom[j]= arrayRandom[j+1]
                arrayRandom[j+1] = tepm
            }
    }

       for (i in arrayRandom.indices) {
        print("${arrayRandom[i]} ")
    }
}
