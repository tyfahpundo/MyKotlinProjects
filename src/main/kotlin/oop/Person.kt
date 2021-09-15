package oop

open class Person(open val name: String,open var age: Int) {
    //To make a class inheritable we declare it with the open keyword
    // Its attributes tio be inherited are also declared with the open keyword name
    //Use the : Parent Class name()

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2021 -age
}
class Student(override val name: String, override var age: Int): Person(name, age){

}
class Employee(override val name: String, override var age: Int): Person(name, age){

}


fun main() {
    val student = Student("Alex",21)
    student.speak()
    println(student.getYearOfBirth())

    val employee = Employee("Rodney",23)
    employee.greet("Allen")
    println(employee.getYearOfBirth())
}