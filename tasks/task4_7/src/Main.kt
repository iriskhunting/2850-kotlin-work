// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Provide only one argument - a path to .txt file")
        exitProcess(1)
    }

    val filePath = Path(args[0])
    var longLineNum = 0
    var longLineLength = 0
    var i = 1
    
    filePath.forEachLine {
        if (it.length > longLineLength) {
            longLineNum = i
            longLineLength = it.length
        }

        i++
    }

    println("Line $longLineNum is the longest (length = $longLineLength)")

}
