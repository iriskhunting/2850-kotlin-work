// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main() {
    val me = Person.create("Iris", LocalDate(2006, 12, 29))
    val evil_me = Person.create("Iris", LocalDate(2006, 12, 30))
}