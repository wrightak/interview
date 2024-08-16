package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveElementTest {

    @Test
    fun example1() {
        val nums = intArrayOf(3, 2, 2, 3)
        assertEquals(2, RemoveElement().removeElement(nums, 3))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        assertEquals(5, RemoveElement().removeElement(nums, 2))
    }
}
