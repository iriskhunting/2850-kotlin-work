// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: Enter two arguments")
        exitProcess(1)
    }

    val is_anagram = anagrams(args[0], args[1])

    val message = if (is_anagram) "Anagrams" else "Not Anagrams"
    println(message)
}