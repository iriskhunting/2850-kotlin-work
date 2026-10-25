// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
    val me = Person("iRIs", LocalDate(2006, 12, 29))
    println(me.name)
}