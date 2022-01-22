/*
*
*
*
*/



fun main(){
    try{
        val (N, K, M) = readLine()!!.split(' ').map(String::toInt)
        var N1 = N
        var coins = 0
        var i = 0
        println("Math.abs(K/M) - ${Math.abs(K/M)}")
        println("(M + Math.abs(K/M)) - ${(M + Math.abs(K/M))}")
        while(N1 > M){
            N1 = N1 - (M + Math.abs(K/M))
                coins += Math.abs(K/M)
                i++
        }
            println("${coins}")
            println("i - ${i}")

        } catch (ex: Exception) {
            println("Ошибка ввода")
    }
}

