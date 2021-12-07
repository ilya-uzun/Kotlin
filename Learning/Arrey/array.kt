fun main(){
    val fiveFives = Array(5,{5})
    for (i in fiveFives.indices) print("${arrayRandom[i]} ")
   
   }
    println(fiveFives[0])
    
    fun isSorted(a: IntArray): Unit {
    for (i in 0..a.size - 1) {
    if (a [i]> a [i + 1]) 
    return println ("NO")
} 
    return println ("YES")
    
}

fun printArray(a: Int, b: Int): Array {
    val fiveFives = Array(a,{b})
    
}


fun main() {

} 

fun createArray(number: Int): IntArray {
    val scanner = Scanner (System.`in`) 
    val array = IntArray (number) 
    for (i in 1..number) {
        array [i - 1] = number.nextInt()
    } 
    return array
} 
fun main() {
    val scanner = Scanner (System.`in`) 
    val n = scanner.nextInt() 
    val sortedArray = createArray(n) isSorted(sortedArray)}
}
