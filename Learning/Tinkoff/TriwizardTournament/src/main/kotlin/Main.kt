fun main() {
    println("Введите условия")

    val myArray = Array(3, { readLine()!!.toString()})
    var Tournament = mutableListOf<String>("a","b","c")

    for(i in myArray){
        if (i == "a>b" || i == "a=b") {
            Tournament[i] = "a"
        }
    }

    //вывод массива
    Tournament.forEach { print(it) }

}