// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        rollDice()
    }

    else {
        val sides = args[0].substringAfter('d').toInt()
        val numDice = args[0].substringBefore('d').toInt()

        rollDice(sides, numDice)
    }
    
}