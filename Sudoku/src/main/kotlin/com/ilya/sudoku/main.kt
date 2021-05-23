@file:JvmName("Main")

package com.ilya.sudoku

import java.io.File
import java.io.InputStream

fun main() {

    val input = readFile("input")
    val solution = readFile("solution")

    var result = true
    for (i in 0 until 9){
        if (!сheckLine(i, input, solution)){
            result = false
            break
        }
    }

    println(result)
//    println(input)
//    println(solution)

}

// проверка строчек на повторение
fun сheckLine(lineNumber:Int, input:Map<Coorinate, Int>, solution:Map<Coorinate, Int>): Boolean{
    for (i in 0 until 8){
        val checkCoordinate = Coorinate(x = lineNumber, y = i)
        val fromInput = input[checkCoordinate]
        val fromSolution = solution[checkCoordinate]
        val checkValue = fromInput ?: fromSolution?: return false // ?: либо
        for (j in i+1 until 9){
            val intenalCoorinate = Coorinate(x = lineNumber, y = j)
            val intenalValue = fromInput ?: fromSolution ?: return false
            if (checkValue != intenalValue){
                return false
            }
        }
    }
    return true
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

