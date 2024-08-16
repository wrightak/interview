package leetcode

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        return search(nums, target, 0, nums.size - 1)
    }

    private fun search(nums: IntArray, target: Int, lowerIndex: Int, upperIndex: Int): Int {
        val middleIndex: Int = lowerIndex + (upperIndex - lowerIndex) / 2
        val middleValue = nums[middleIndex]
        if (middleValue == target) {
            return middleIndex
        } else if (middleValue < target) {
            if (middleIndex == upperIndex) {
                return middleIndex + 1
            }
            return search(nums, target, middleIndex + 1, upperIndex)
        } else {
            if (lowerIndex == middleIndex) {
                return middleIndex
            }
            return search(nums, target, lowerIndex, middleIndex - 1)
        }
    }
}
