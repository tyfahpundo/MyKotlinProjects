import java.util.*

fun main(){
    val random = Random().nextInt(50) + 1

    when(random){
        in 1..10 -> println("The number $random is btwn 1 and 10")
        in 11..20 -> println("The number $random is btwn 11 to 20")
        in 21..30 -> println("The number $random is btwn 21 to 30")
        in 31..40 -> println("The number $random is btwn 31 to 40")
        in 41..50 -> println("The number $random is btwn 41 to 50")
    }
}
