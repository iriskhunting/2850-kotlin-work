// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val me = Person("", "2006-12-29")

    println("${me.name} born on ${me.birth} and married = ${me.isMarried}")
}