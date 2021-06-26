 
fun main(){
    
    val table: Array<Array<Int>> = Array(3, { Array(2, {0}) })
    table[0] = arrayOf((0 until 10).random(), (0 until 10).random())
    table[1] = arrayOf((0 until 10).random(), (0 until 10).random())
    table[2] = arrayOf((0 until 10).random(), (0 until 10).random())
    
     for(row in table){
        for(cell in row){
            print("$cell  ")
        }
        println()
    }
}

