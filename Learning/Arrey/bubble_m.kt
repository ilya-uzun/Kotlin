fun main(args: Array<String>) {
    println ("Введите число")
    var size = readLine()!!.toInt() // !!.toInt() - преобразование из Strung
    println ("\n")
    // проверка на отричательное значение
    if (size <= 0){
        println("Введенно недопустимое значение")
        return 
    }
    // Инициализация массива способ 1
    var arrayRandom = Array (size, {(0 until 10).random()})

    for (i in arrayRandom.indices) {
        print("${arrayRandom[i]} ")
    }
    print("\n")

    for (i in 1..size - 1){
        for (j in 0..size - i - 1)
            if(arrayRandom[j] > arrayRandom[j+1]){
                var tepm = arrayRandom[j] 
                arrayRandom[j]= arrayRandom[j+1]
                arrayRandom[j+1] = tepm
            }
    }

    for (i in arrayRandom.indices) {
        print("${arrayRandom[i]} ")
       }
    print("\n")
}
