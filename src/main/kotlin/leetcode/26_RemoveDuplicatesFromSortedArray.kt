package leetcode

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var currentIndex = 1
        var currentInt = nums[0]
        for (num in nums) {
            if (num > currentInt) {
                nums[currentIndex] = num
                currentIndex++
                currentInt = num
            }
        }
        return currentIndex
    }
}
