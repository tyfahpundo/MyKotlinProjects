package oop

class Person(name: String,age: Int) {
    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
    }

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