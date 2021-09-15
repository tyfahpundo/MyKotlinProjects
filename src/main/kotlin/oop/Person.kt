package oop

abstract class Person(open val name: String,open var age: Int) {
    //To make a class inheritable we declare it with the open keyword
    // Its attributes tio be inherited are also declared with the open keyword name
    //Use the : Parent Class name()
    init{
        println("Object created!!!!")
    }

    abstract fun speak()

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2021 -age
}
class Student(override val name: String, override var age: Int, val studentId: Long): Person(name, age){
    fun isIntelligent()= true
    override fun speak() {
        println("Hie there l am a Student")
    }
}
class Employee(override val name: String, override var age: Int): Person(name, age){
    fun receivedPayment(){
        println("Received Payment!!")
    }

    override fun speak() {
        println("Hie l am an Employee")
    }
}


fun main() {
    val student = Student("Alex",21,190240)
    student.speak()
    println(student.getYearOfBirth())
    println(student.isIntelligent())
    println("The student ID is ${student.studentId}")

    val employee = Employee("Rodney",23)
    employee.greet("Allen")
    println(employee.getYearOfBirth())
    employee.receivedPayment()
}