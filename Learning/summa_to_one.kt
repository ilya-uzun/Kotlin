fun main(){
  println("Введите число")
   val n = 6 //readLine()!!.toInt() // онлайн компилятор выдает ошибку
   val m = 3 //readLine()!!.toInt()
   println("$n, $m")
   println(sum(n,m))
}

fun sum(n: Int, m: Int): Int {
  var s = 0
  for (i in 0 until n) s++
  if (n==s) for (j in 0 until m) s++
  return s
}
