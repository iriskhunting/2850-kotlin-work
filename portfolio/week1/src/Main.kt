// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    // Converting arguments 
    val a = args[0].toFloat()
    val b = args[1].toFloat()
    val c = args[2].toFloat()

    // Calculating semiperimeter
    val s = 0.5 * (a + b + c)

    // Calculating area of triangle
    val area = sqrt(s * (s - a) * (s - b) * (s - c))

    // Output area
    println("Area = %.5f".format(area))

}