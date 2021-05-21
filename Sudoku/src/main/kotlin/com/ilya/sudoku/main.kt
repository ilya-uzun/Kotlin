@file:JvmName("Main")

package com.ilya.sudoku

import java.io.File
import java.io.InputStream

fun main() {

    val input = readFile("input")
    val solution = readFile("solution")
    //val input: InputStream = File("input").inputStream()
    //val inputString = input.bufferedReader().use { it.readText() }
    println(input)
    println(solution)
}

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


