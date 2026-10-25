// Task 12.8.2: enum class for playing card ranks

enum class Rank(val symbol: Char) {
    A, 1, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K;

    override fun toString() = "$symbol"
}