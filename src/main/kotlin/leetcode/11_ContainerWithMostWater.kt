package leetcode

class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var currentLeftIndex = 0
        var currentRightIndex = height.size - 1
        var maxLeftIndex = 0
        var maxRightIndex = height.size - 1
        var maxLeft = height[currentLeftIndex]
        var maxRight = height[currentRightIndex]
        var currentMaxArea = Integer.min(maxLeft, maxRight) * (maxRightIndex - maxLeftIndex)
        while (currentLeftIndex < currentRightIndex) {
            if (height[currentLeftIndex] > maxLeft) {
                maxLeft = height[currentLeftIndex]
                maxLeftIndex = currentLeftIndex
            }
            if (height[currentRightIndex] > maxRight) {
                maxRight = height[currentRightIndex]
                maxRightIndex = currentRightIndex
            }
            val currentArea = Integer.min(maxLeft, maxRight) * (maxRightIndex - maxLeftIndex)
            if (currentArea > currentMaxArea) {
                currentMaxArea = currentArea
            }
            if (maxLeft > maxRight) {
                currentRightIndex--
            } else {
                currentLeftIndex++
            }
        }
        return currentMaxArea
    }
}
