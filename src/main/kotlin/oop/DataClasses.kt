package oop

class Book(val title: String, val author: String, val publicationYear: Int, var price: Double){
    override fun toString(): String{
        return "Book[tittle=$title, author=$author, publicationYear=$publicationYear, price=$price]"
    }
}
data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double){

}

fun main() {
    val book = Book("Captain America","Tafadzwa",2017,99.99)
    val dataBook = DataBook("Captain America","Tafadzwa",2017,99.99)
    val dataBook2 = dataBook.copy(price = 210.0)

    println(book)
    println(dataBook)
    println(dataBook2)
}