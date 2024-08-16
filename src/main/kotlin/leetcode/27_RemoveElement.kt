package leetcode

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var indexFromEnd = nums.size - 1
        var count: Int = 0
        nums.forEachIndexed { index, num ->
            if (index == indexFromEnd + 1) {
                return count
            }

            if (num == `val`) {
                while (nums[indexFromEnd] == `val`) {
                    if (index == indexFromEnd) {
                        return count
                    }
                    indexFromEnd--
                }
                nums[index] = nums[indexFromEnd]
                indexFromEnd--
            }
            count++
        }
        return count
    }
}
