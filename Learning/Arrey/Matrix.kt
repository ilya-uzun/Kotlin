 
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


// Data class с структурай матрици
data class Cell(val row: Int, val column: Int)
 
interface Matrix<E> {
    val height: Int
    val width: Int
 
    operator fun get(row: Int, column: Int): E
    operator fun get(cell: Cell): E
 
    operator fun set(row: Int, column: Int, value: E)
    operator fun set(cell: Cell, value: E)
}
