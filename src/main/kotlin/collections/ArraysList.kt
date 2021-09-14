package collections

fun main(args: Array<String>) {
   val numbers = listOf(1,3,5,7,8,9)
    println(reverseList(numbers))
    println(reverse2(numbers))
}

fun reverseList(list: List<Int>): List<Int>{
    var result = arrayListOf<Int>()
    for(i in 0..list.size-1){
        result.add(list.get(list.size-1-i))
    }
    return result
}

fun reverse2(list: List<Int>): List<Int>{
    var result = arrayListOf<Int>()
    for(i in list.size-1 downTo 0){
        result.add(list.get(i))
    }
    return result
}