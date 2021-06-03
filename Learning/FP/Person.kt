
data class Person(val name: String, val age: Int )

fun main(){
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    // Способ 1 с использованием лямда вырожений
    println(people.maxByOrNull {it.age})
    
    // Способ 2 с использованием лямда вырожений
    println(people.maxByOrNull(Person::age))
    
    //Способ вывода без лямда-вырожений
    //findTheOldest(people)
}
/*
fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person ?= null
    for (i in people) {
        if (i.age > maxAge) {
            maxAge = i.age
            theOldest = i
        }
    }
    println(theOldest)
}*/
