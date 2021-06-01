fun main(args: Array<String>) {
    println ("Введите число")
    var size = readArrey()
    println ("\n")
    // Инициализация массива 
    var arrayRandom = Array (size, {(0 until 10).random()})

    arrayRandom.forEach { print("$it ")} // вывод массива
    print("\n")

    for (i in 1..size - 1){
        for (j in 0..size - i - 1)
            if(arrayRandom[j] > arrayRandom[j+1]){
                var tepm = arrayRandom[j] 
                arrayRandom[j]= arrayRandom[j+1]
                arrayRandom[j+1] = tepm
            }
    }
    println("вывод отсортированного массива :")
    arrayRandom.forEach { print("$it ")} // вывод массива
    print("\n")
}

fun readArrey (size: Int = readLine()!!.toInt()): Int = if (size <= 0) 1 else size 
