
fun fizzBuzz(n: Int): Array<String> {
    val a = Array<String>(n, {" "})
    
    for(i in 1..n-1){
        if (i % 15 == 0){
            a.set(i, "FizzBuzz")
        }else if (i % 5 == 0){
            a.set(i, "Buzz")
        }else if (i % 3 == 0){
            a.set(i, "Fizz")
        }else {
            a.set(i, i.toString())
        } 
    }
    return a
}

fun main() {
    val numbersMap = fizzBuzz(16)
    for(i in numbersMap.indices) println(numbersMap[i])
    
}