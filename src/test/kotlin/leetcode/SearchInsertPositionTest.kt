package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SearchInsertPositionTest {

    @Test
    fun example1() {
        val nums = intArrayOf(1, 3, 5, 6)
        assertEquals(2, SearchInsertPosition().searchInsert(nums, 5))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 3, 5, 6)
        assertEquals(1, SearchInsertPosition().searchInsert(nums, 2))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(1, 3, 5, 6)
        assertEquals(4, SearchInsertPosition().searchInsert(nums, 7))
    }
}
