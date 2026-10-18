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
    "Median of list containing 1 element is correct" {
        val nums = listOf(5.7)
        median(nums) shouldBe 5.7
    }

    "Median of list containing 2 elements is correct" {
        val nums = listOf(6.1, 3.8)
        median(nums) shouldBe 3.8
    }

    "Median of list containing 3 elements is correct" {
        val nums = listOf(5.6, 2.2, 1.0)
        median(nums) shouldBe 2.2
    }

    "Median of list containing 4 elements is correct" {
        val nums = listOf(5.0, 7.2, 15.4, 26.0)
        median(nums) shouldBe 7.2
    }



})
