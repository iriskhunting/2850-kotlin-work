// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    
    // Ensure function works for a list of size 1
    "Median of list containing 1 element is correct" {
        val nums = listOf(5.7)
        median(nums) shouldBe 5.7
    }

    // Ensure function works for an unordered list of size 2
    "Median of list containing 2 elements is correct" {
        val nums = listOf(6.1, 3.8)
        median(nums) shouldBe 3.8
    }

    // Ensure function works for an unordered list of size 3
    "Median of list containing 3 elements is correct" {
        val nums = listOf(5.6, 2.2, 1.0)
        median(nums) shouldBe 2.2
    }

    // Ensure function works for an ordered list of size 4
    "Median of list containing 4 elements is correct" {
        val nums = listOf(5.0, 7.2, 15.4, 26.0)
        median(nums) shouldBe 7.2
    }
    


})
