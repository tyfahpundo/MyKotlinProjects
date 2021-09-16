package oop

//Don't Repeat Yourself
class Stack<E>(private vararg val items: E){
    private val elements = items.toMutableList()

    fun push(element: E){
        elements.add(element)
    }
    fun pop(): E? {
        if(!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }
    private fun isEmpty(): Boolean{
        return elements.isEmpty()
    }
}

fun main() {
    val stack = Stack(3,5,2,8)
    println(stack.push(11))
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
}