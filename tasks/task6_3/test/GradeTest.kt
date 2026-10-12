// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    
    // typical values
    @Test
    fun `Mark of 55 gives a pass`() {
        assertEquals("Pass", grade(55))
    }

    @Test
    fun `Mark of 23 gives a fail`() {
        assertEquals("Fail", grade(23))
    }

    @Test
    fun `Mark of 89 gives a Distinction`() {
        assertEquals("Distinction", grade(89))
    }

    @Test
    fun `Mark of -10 gives a ?`() {
        assertEquals("?", grade(-10))
    }

    @Test
    fun `Mark of 150 gives a ?`() {
        assertEquals("?", grade(150))
    }

    // boundary values
    @Test
    fun `Mark of 0 gives a fail`() {
        assertEquals("Fail", grade(0))
    }

    @Test
    fun `Mark of 39 gives a fail`() {
        assertEquals("Fail", grade(39))
    }

    @Test
    fun `Mark of 40 gives a pass`() {
        assertEquals("Pass", grade(40))
    }

    @Test
    fun `Mark of 69 gives a pass`() {
        assertEquals("Pass", grade(69))
    }

    @Test
    fun `Mark of 70 gives a Distinction`() {
        assertEquals("Distinction", grade(70))
    }

    @Test
    fun `Mark of 100 gives a Distinction`() {
        assertEquals("Distinction", grade(100))
    }

    @Test
    fun `Mark of -1 gives a ?`() {
        assertEquals("?", grade(-1))
    }

    @Test
    fun `Mark of 101 gives a ?`() {
        assertEquals("?", grade(101))
    }


}
