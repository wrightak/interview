package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    fun example1() {
        val nums = intArrayOf(1, 1, 2)
        assertEquals(2, RemoveDuplicatesFromSortedArray().removeDuplicates(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        assertEquals(5, RemoveDuplicatesFromSortedArray().removeDuplicates(nums))
    }
}
