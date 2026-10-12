// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here
    "Mark between 0 and 39 gives a fail" {
        assertSoftly {
            withClue("Mark=0") { grade(0) shouldBe "Fail" }
            withClue("Mark=23") { grade(23) shouldBe "Fail" }
            withClue("Mark=39") { grade(39) shouldBe "Fail" }
        }
    }

    "Mark between 40 and 69 gives a pass" {
        assertSoftly {
            withClue("Mark=40") { grade(40) shouldBe "Pass" }
            withClue("Mark=51") { grade(51) shouldBe "Pass" }
            withClue("Mark=69") { grade(69) shouldBe "Pass" }
        }
    }

    "Mark between 70 and 100 gives a distinction" {
        assertSoftly {
            withClue("Mark=70") { grade(70) shouldBe "Distinction" }
            withClue("Mark=87") { grade(87) shouldBe "Distinction" }
            withClue("Mark=100") { grade(100) shouldBe "Distinction" }
        }
    }

    "Mark below 0 and above 100 gives ?" {
        assertSoftly {
            withClue("Mark=-1") { grade(-1) shouldBe "?" }
            withClue("Mark=-10") { grade(-10) shouldBe "?" }
            withClue("Mark=101") { grade(101) shouldBe "?" }
            withClue("Mark=150") { grade(150) shouldBe "?" }
        }
    }
})
