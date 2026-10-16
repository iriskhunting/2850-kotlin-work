// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Please provide one file name")
        exitProcess(1)
    }

    val temps = fetchData(args[0])
    val lowest = temps.minBy { it.second }
    val highest = temps.maxBy { it.second }
    println("Warmest Station is ${highest.first}: ${highest.second}")
    println("Coldest Station is ${lowest.first}: ${lowest.second}")

    //val average = averageTemp(temps)

    val average = (temps.sumOf { it.second })/(temps.count())
    println("Average temp: %.2f".format(average))


}
