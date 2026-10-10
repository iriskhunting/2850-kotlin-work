// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: 3 marks required")
        exitProcess(1)
    }

    for (n in 0..2) {
        if ("-" in args[n]) {
            println("Error: No negative marks")
            exitProcess(2)
        }

        args[n].toFloatOrNull()
        println(args[n])
        if (args[n] is null) {
            println("Error: No non-numeric marks")
        }
    }


    // Calculate rounded average mark
    val average_mark = ((args[0].toFloat() + args[1].toFloat() + args[2].toFloat()) / 3).roundToInt()

    val grade = when (average_mark) {
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else       -> "?"
    }

    println("Average mark: $average_mark")
    println("Grade: $grade")

}