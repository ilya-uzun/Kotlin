import java.lang.Math.cos

fun main(){
    println("Введите число")
    val x : Double = readLine()!!.toDouble()
    println(cosFixpoint(x))
    println(cosRecursion(x))
    println(cosRec(x))
    println(cosCont())
}
// Пример обычной функции
private fun cosFixpoint(x: Double = 1.0): Double {
        var x1 = x
        while (true) {
            val y = cos(x)
            if (x1 == y) return y
                x1 = y
        }
}

// Пример рекурсивной функции, запись  одну сроку
tailrec fun cosRecursion(x: Double): Double = if (x == cos(x)) x else cosRecursion(cos(x))

// Пример рекурсивной функции, развернутая запись 
tailrec fun cosRec(x: Double): Double {
    val r = cos(x)
    return if (x == r) x else cosRec(r)
}

private fun cosCont(): Double {
        var x = 3.0
        while (true) {
            val y = cos(x)
            if (x == y) return y
                x = y
        }
}
