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
fun main(){
//Переменные функции

    // Определение указателя на функцию sum
    var operatin: (Int, Int) -> Int = ::sum
    val result1 = operation(14.5)
    
    //переопределение указателя на функцию subration
    operation = ::subtract
    val result2 = operation(10, 6)
    
//Функция как параметр функции
    action(5, 3, ::sum)
    action(5, 3, ::multiply)
    action(5, 3, ::subtract)
    
//анонимные функции 
    val sum = fun(x: Int, y: Int): Int = x + y 
}
//Функция как параметр функции
fun action (n1: Int, n2:Int, op: (Int, Int)-> Int){
    val result = op(n1, n2)
    println(result)
}

// функции для использовании в примерах
fun sum(a: Int, b: Int): Int = a + b
fun multiply(a: Int, b: Int): Int a * b
fun subtract(a: Int, b: Int): Int a - b
~~~

