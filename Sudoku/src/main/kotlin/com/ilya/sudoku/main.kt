@file:JvmName("Main")

package com.ilya.sudoku

import java.io.File

fun main() {

    val input = readFile("input")
    val solution = readFile("solution")

    var result = CheckOutcome.Ok
    for (i in 0 until 9){
        val rowCheckOut = // сравнение строк
            сheckLine(input, solution) { index -> Coorinate( x = i, y = index) }
        if (rowCheckOut != CheckOutcome.Ok){
            result = rowCheckOut
            break
        }
        val columnCheckOut = // сравнение столбцов
            сheckLine(input, solution) { index -> Coorinate( x = index, y = i ) }
        if (columnCheckOut != CheckOutcome.Ok){
            result = columnCheckOut
            break
        }
    }
    println(result)
}

// проверка строчек на повторение
fun сheckLine(
              input:Map<Coorinate, Int>,
              solution:Map<Coorinate, Int>,
              coordinateGenerator: (Int) -> Coorinate
): CheckOutcome{
    for (i in 0 until 8){
        val checkCoordinate = coordinateGenerator(i)
        val checkValue =
            input[checkCoordinate] ?: solution[checkCoordinate] ?: return CheckOutcome.Incomplete // ?: либо
        for (j in i+1 until 9){
            val intenalCoorinate = coordinateGenerator(j)
            val intenalValue =
                input[intenalCoorinate] ?: solution[intenalCoorinate] ?: return CheckOutcome.Incomplete
            if (checkValue == intenalValue){ // сранения линий
                return CheckOutcome.Failed
            }
        }
    }
    return CheckOutcome.Ok
}

// чтение из файла
fun readFile(fileName: String):Map<Coorinate, Int> =
    File(fileName)
        .readLines()
        .withIndex()
        .flatMap { indexedValue ->
            val xCoordinate = indexedValue.index
            indexedValue.value.toCharArray().withIndex()
                .filter { indexedChar -> indexedChar.value != '.'} // != добавели фильтр точекр
                .map{ indexedChar ->
                    val yCoordinate = indexedChar.index
                    val coordinate = Coorinate(xCoordinate, yCoordinate)
                    val number = Character.getNumericValue(indexedChar.value)
                    coordinate to number
                }
        }
        .toMap()

