fun isSorted(a: Array<Int>, size: Int): Unit {
    
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
} 
// 
fun createArray(number: Int): Array<Int>{
    //val scanner = Scanner(System.`in`) 
    //val array = IntArray(number) 

    val a: Array<Int> = Array(3) {0}

    for (i in 0 until number){
        //array[i - 1] = number.nextInt()
        a[i] = (Math.random() * 10).toInt()
        print(" ${a[i]}")
    } 
    return a
} 

fun main() {
    //val scanner = Scanner (System.`in`) 
    //val n = scanner.nextInt() 
    val n = 3
    val sortedArray = createArray(n) 
    val outAnswer = isSorted(sortedArray, n)
}

