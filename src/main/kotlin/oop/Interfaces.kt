package oop

interface Drivable{
    fun drive()
}
interface Buildable{
    val timeRequired: Int
    fun build()
}

class Car(val color: Color): Drivable, Buildable{
    override val timeRequired: Int = 120
    override fun build() {
        println("Building a shiny Car....")
    }

    override fun drive() {
        println("Driving a Car.....")
    }

}
class MotorCycle(val color: Color): Drivable{
    override fun drive() {
        println("Riding a motorcycle.....")
    }
}

fun main() {
    val car = Car(Color.GREEN)
    car.drive()
    val motorcycle = MotorCycle(Color.RED)
    motorcycle.drive()
}