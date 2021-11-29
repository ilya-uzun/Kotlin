/*
* Для определения интерфейса применяется ключевое слово interface. Например:
*/
inreface Movable{
    var speed: Int  // объявление свойства
    fun moe()      // определение функции без реализации
    fun stop(){    // определение функции с реализацией по умолчанию
        println("Остановка")
}

/*
* Определим два класса, которые применяют интерфейс:
*/

class Car : Movable{

    override var speed = 60
    override fun move(){
        println("Машина едет со скоростью $speed км/ч")
    }
}

class Aircraft : Movable{

    override var speed = 600
    override fun move(){
        println("Самолет летит  со скоростью $speed км/ч")
    }
    override funstop(){
        println("Приземление")
}

fun main() {

    val m1: Movable = Car()
    val m2: Movable = Aircraft()
    // val m3: Movable = Movable() напрямую объект интерфейса создать нельзя

    m1.move()
    m1.stop()
    m2.move()
    m2.stop()
}