fun main(){
  println("Введите число")
  val n = readLine()!!.toInt()
  val m = readLine()!!.toInt()
  pruntln(sum(n,m))
}

fun sum(n: Int, m: Int): Int {
  var summa
  for (i in n) summa++
  if (n==summa) for (j in m) summa++
  return summa
}
