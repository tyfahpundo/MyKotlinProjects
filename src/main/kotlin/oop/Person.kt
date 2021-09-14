package oop

class Person(val name: String,var age: Int) {

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

//    fun getYearOfBirth(): Int {
//        return 2021 - age
//    }
    fun getYearOfBirth() = 2021 -age
}
fun main() {
    val person = Person("Tafadzwa",21)
    println(person.name)
    println(person.age)

    person.speak()
    person.greet("Alex")
    println(person.getYearOfBirth())
}