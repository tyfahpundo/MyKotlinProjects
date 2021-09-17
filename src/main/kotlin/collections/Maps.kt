package collections

fun main() {
    val namesToAges = mapOf(
        "Rodney" to 21,
        "Tafadzwa" to 21
    )
    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    namesToAges.entries.forEach{
        println("${it.key} is ${it.value} years old.")
    }
}