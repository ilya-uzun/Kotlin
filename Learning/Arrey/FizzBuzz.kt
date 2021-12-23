
fun fizzBuzz(n: Int): Array<String> {
    var a = Array(n){i -> (1+i).toString()}
    
    a.forEachIndexed{ i, element -> 
        if (i % 3 == 0 && i % 5 == 0) a[i] = "FizzBuzz"
        if (i % 3 == 0) a[i] = "Fizz"
        if (i % 5 == 0) a[i] = "Buzz"
    }
    
    return a
}

fun main() {
    val numbersMap = fizzBuzz(10)
    for(i in numbersMap.indices) println(numbersMap[i])
    
}