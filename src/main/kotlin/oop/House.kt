package oop

class House(val height: Double , val color: String, val price: Int) {
    fun print(){
        println("House [height = $height, color=$color, price=$price]")
    }
}

fun main() {
    val house = House(4.5,"blue",45000)
}