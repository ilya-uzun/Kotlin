fun main(){
  println("Введите число")
  try {
       val sum = readLine()!!.toDouble() // стоиость вех акций
       val o = readLine()!!.toDouble()   // котировка
       val c = readLine()!!.toDouble()   // Процент
       val b = readLine()!!.toDouble()   // время владения в днях
       println(HKD(CostBond(sum, o), c, b))
   }
    catch (ex: Exception) {
        println("Введенно неверное число")
    }
   
}
//Определяем стоимость бонда
fun CostBond (S:Double, O:Double):Double = S/100*O
// НКД
fun HKD(O: Double, C: Double, B: Double): Double = O / 100 * C / 365 * B


// где О – стоимость облигации в рублях, вычисленная по текущей котировке в процентах от номинала, 
// С – купон в годовых процентах, 
// В – время владения в днях с момента последней выплаты по ставке.

