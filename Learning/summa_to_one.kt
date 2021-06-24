fun main(){
  println("Введите число")
  try {
       val n = readLine()!!.toInt() // онлайн компилятор выдает ошибку
       val m = readLine()!!.toInt()
       println(sum(n,m))
   }
    catch (ex: Exception) {
        println("Введенно неверное число")
    }
   
}

fun sum(n: Int, m: Int): Int {
  var s = 0
  for (i in 0 until n) s++
  if (n==s) for (j in 0 until m) s++
  return s
}
