// Task 12.1: program that uses a Point object

fun main() {
    val p1 = Point(1.0, 2.0)
    val p2 = Point(3.0, 4.0)

    println(p1.x)   // prints 0.0
    println(p1.y)   // prints 0.0
    println(p1.distance())
    println(p1.distanceTo(p2))

}