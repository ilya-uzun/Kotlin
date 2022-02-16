### Sudoku 
> выполнено в консоле, чтение файлов       
### Web-react
> веб приложение с использованием React


### SortWord 
> подсчет слов в файле 

#### Learning/Arrey/
> решение задачи о выводе матрицы 2х3 заполненной случайными числами    

> Информация о чтение файла     
> [ссылка](https://www.fandroid.info/7-osnovy-kotlin-fajlovye-operatsii/)    
> [GitHub](https://github.com/ilya-uzun/Kotlin/blob/master/Sudoku/src/main/kotlin/com/ilya/sudoku/main.kt)   

~~~
fun main() {
	val a = "XXIL"
    decode(a)
}

fun decode(str: String): Int {
    var num: Int = 0
    
    str.map{ 
        
            when (it) {
                'I' -> num = 1
                'V' -> num = 5
                'X' -> num = 10
                'L' -> num = 50
                'C' -> num = 100
                'D' -> num = 500
                'M' -> num = 1000
                else -> num = 0
            }
        var temp: Int = num
        if(temp == num) num + num
        if(temp < num) num - temp
        if(temp > num) temp + num
    }
    println("$num")

    return 0
}
~~~
