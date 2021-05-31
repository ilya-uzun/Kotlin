fun main(args: Array<String>) {
    println ("Введите число")
    var size = readArrey()
    println ("\n")
    // Инициализация массива 
    var arrayRandom = Array (size, {(0 until 10).random()})
  
    var PrintAreey = printAreey(arrayRandom)
    // for (i in arrayRandom.indices) {
    //     print("${arrayRandom[i]} ")
    // }
    print("\n")

    for (i in 1..size - 1){
        for (j in 0..size - i - 1)
            if(arrayRandom[j] > arrayRandom[j+1]){
                var tepm = arrayRandom[j] 
                arrayRandom[j]= arrayRandom[j+1]
                arrayRandom[j+1] = tepm
            }
    }

    // for (i in arrayRandom.indices) {
    //     print("${arrayRandom[i]} ")
    //    }
    print("\n")
}

fun readArrey (size: Int = readLine()!!.toInt()): Int = if (size <= 0) 1 else size 

fun printAreey (arrayRandom: Array<Int>) : Int {   
    for (i in arrayRandom.indices) {       
       return arrayRandom[i]
       }
}