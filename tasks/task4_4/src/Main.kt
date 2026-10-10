// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        println("Error: Need 3 fp values. initial temp, max temp, increment")
        exitProcess(1)
    }

    var cTemp = args[0].toFloat() //set current temp to initial temp
    val cTempMax = args[1].toFloat()
    val inc = args[2].toFloat()

    while (cTemp <= cTempMax ) {
        var fTemp = (cTemp * 9/5) + 32
        println("%5.1f %6.1f".format(cTemp, fTemp))
        cTemp += inc
    }
} 
