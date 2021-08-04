
fun main(args: Array<String>) {
    val numbers = mutableListOf(58,2,78,3,9,8,10)
    val sortedList = merge(numbers)
    println("Первоначальный массив: $numbers")
    println("Отсортированный массив: $sortedList")
}

fun mergeSort(list: List<Int>): List<Int> {
    if (list.size <= 1) {
        return list
    }

    val middle = list.size / 2 // Определяем середину массива
    var left = list.subList(0,middle);
    var right = list.subList(middle,list.size);

    // разбиваем списал до одного элемента
    return merge(merge(left), mergeSort(right)) 
}
// сортировка двух списков и объединение отсортированного списка
fun merge(left: List<Int>, right: List<Int>): List<Int>  {
    var indexLeft = 0
    var indexRight = 0
    var newList : MutableList<Int> = mutableListOf()

    while (indexLeft < left.count() && indexRight < right.count()) {
        if (left[indexLeft] <= right[indexRight]) {
            newList.add(left[indexLeft])
            indexLeft++
        } else {
            newList.add(right[indexRight])
            indexRight++
        }
    }

    while (indexLeft < left.size) {
        newList.add(left[indexLeft])
        indexLeft++
    }

    while (indexRight < right.size) {
        newList.add(right[indexRight])
        indexRight++
    }
   
    return newList;
}