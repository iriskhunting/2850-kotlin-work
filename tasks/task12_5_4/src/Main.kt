// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val me = Person("Iris", LocalDate(2006, 12, 29))
    println("${me.name} is ${me.age} years old")
}