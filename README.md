### Sudoku 
> выполнено в консоле, чтение файлов       
### Web-react
> веб приложение с использованием React


#### Learning/Arrey/
> решение задачи о выводе матрицы 2х3 заполненной случайными числами    

пример
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    var summa : Long = a
    for(i in a until b){
        summa *= summa
        while(a > i) summa ++
    }
    println("$summa")
}
