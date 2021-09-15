package oop

interface Drivable{
    fun drive()
}
interface Buildable{
    val timeRequired: Int
    fun build()
}

class Car(val color: String): Drivable, Buildable{
    override val timeRequired: Int = 120
    override fun build() {
        println("Building a shiny Car....")
    }

    override fun drive() {
        println("Driving a Car.....")
    }

}
class MotorCycle(val color: String): Drivable{
    override fun drive() {
        println("Riding a motorcycle.....")
    }
}

fun main() {
    val car: Drivable = Car("Blue")
    car.drive()
    val motorcycle: Drivable = MotorCycle("Red")
    motorcycle.drive()
}