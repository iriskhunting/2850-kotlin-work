// Task 12.8.1: demo program for Day enum class

fun main() {
    print("Enter day of the week: ")
    val dayString = readln().replaceFirstChar(Char::uppercase)
    try {
    val day = Day.valueOf(dayString)
    }
    catch (error: IllegalArgumentException) {
        println("Enter only a day of the week\nPossible options: ${Day.entries}")
    }
}