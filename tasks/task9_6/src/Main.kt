// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    try {
        val dataset = readData(args[0])
        val variance = variance(dataset)
        println("Dataset size = ${dataset.size}")
        println("Variance = %.5f".format(variance))
    }
    catch (error: IllegalArgumentException) {
        println("provide a name of an existing file with enough data")
    }
    catch (error: IllegalStateException) {
        println("provide a non-empty file with only numeric data")
    }
    
    catch (error: Exception) {
        println("some error occurred")
    }
}
