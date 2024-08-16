package leetcode

class LongestPalindromicSubstring {
    data class PalindromeRange(val left: Int, val right: Int) {
        fun size(): Int {
            return right - left + 1
        }
    }

    fun longestPalindrome(s: String): String {
        val sortedIndexes = sortFromCenter((0..<s.length).toList().toIntArray())
        var longestRange = PalindromeRange(0, 0)
        for (index in sortedIndexes) {
            val oddRange = expansionFrom(index, index, s)
            if (oddRange.size() > longestRange.size()) {
                longestRange = oddRange
            }
            if (index < s.length - 1) {
                val evenRange = expansionFrom(index, index + 1, s)
                if (evenRange.size() > longestRange.size()) {
                    longestRange = evenRange
                }
            }
        }
        return s.substring(longestRange.left, longestRange.right + 1)
    }

    private fun expansionFrom(startingLeftIndex: Int, startingRightIndex: Int, s: String): PalindromeRange {
        var leftIndex = startingLeftIndex
        var rightIndex = startingRightIndex
        var longestRange = PalindromeRange(leftIndex, leftIndex)
        while (leftIndex >= 0 && rightIndex < s.length) {
            if (s[leftIndex] == s[rightIndex]) {
                longestRange = PalindromeRange(leftIndex, rightIndex)
                leftIndex--
                rightIndex++
            } else {
                break
            }
        }
        return longestRange
    }

    private fun sortFromCenter(nums: IntArray): IntArray {
        val leftCenterIndex = leftCenterIndexForSize(nums.size)
        val rightCenterIndex = rightCenterIndexForSize(nums.size)
        var orderedNums = IntArray(nums.size)
        var offset = 0
        var orderedNumsIndex = 0
        if (nums.size % 2 != 0) {
            orderedNumsIndex = 1
            offset = 1
            orderedNums[0] = nums[leftCenterIndex]
        }
        while (leftCenterIndex - offset >= 0) {
            orderedNums[orderedNumsIndex] = nums[leftCenterIndex - offset]
            orderedNums[orderedNumsIndex + 1] = nums[rightCenterIndex + offset]
            orderedNumsIndex += 2
            offset++
        }
        return orderedNums
    }

    private fun leftCenterIndexForSize(size: Int): Int {
        if (size % 2 == 0) {
            return size / 2 - 1
        } else {
            return size / 2
        }
    }

    private fun rightCenterIndexForSize(size: Int): Int {
        return size / 2
    }
}
