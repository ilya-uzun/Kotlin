fun isSorted(a: Array<Int>, size: Int): Unit {

    for(i in a.indices){println(a[i])} 
    println(a.size)

    for(i in until size){println(a[i])} 

/*
    for(i in 0..a.size - 1){
        if(a[i]>a[i + 1]){
            var j = 0 
            j++  
        }
    } 
    
    println ("size $size")
    println ("a.size $a.size")
    
    if (a.size == size) {
        return println ("YES")
    } else {
        return println ("NO")
    }  
*/
} 
// 
fun createArray(number: Int): Array<Int>{
    //val scanner = Scanner(System.`in`) 
    //val array = IntArray(number) 

    val a: Array<Int> = Array(3) {Math.random() * 10).toInt()}

    //for (i in 0 until number){
        //array[i - 1] = number.nextInt()
    //    a[i] = (Math.random() * 10).toInt()
    //    print(" ${a[i]}")
    //} 
    return a
} 

fun main() {
    //val scanner = Scanner (System.`in`) 
    //val n = scanner.nextInt() 
    val n = 3
    val sortedArray = createArray(n) 
    println("")
    val outAnswer = isSorted(sortedArray, n)
outAnswer
}


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
