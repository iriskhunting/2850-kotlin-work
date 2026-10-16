// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val sentence = "The quick brown fox jumps over the lazy dog"

    println(sentence.howMany { it.lowercase() in "aeiou"})
    println(sentence.howMany { it.isUpperCase()})
}
