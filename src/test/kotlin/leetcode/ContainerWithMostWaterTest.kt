package leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ContainerWithMostWaterTest {

    @Test
    fun example1() {
        val height = intArrayOf(1,8,6,2,5,4,8,3,7)
        assertEquals(49, ContainerWithMostWater().maxArea(height))
    }

    @Test
    fun example2() {
        val height = intArrayOf(1, 1)
        assertEquals(1, ContainerWithMostWater().maxArea(height))
    }
}
