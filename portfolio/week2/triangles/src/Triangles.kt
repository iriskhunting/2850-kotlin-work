// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third
    
    if (a < (b + c) && b < (a + c) && c < (a + b)) {
        return true
    }
    else {
        return false
    }
}

fun triangleArea(triangle: Triangle): Double {
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third
    
    // Calculating semiperimeter
    val s = 0.5 * (a + b + c)

    // Calculating area of triangle
    val area = sqrt(s * (s - a) * (s - b) * (s - c))

    return area

}