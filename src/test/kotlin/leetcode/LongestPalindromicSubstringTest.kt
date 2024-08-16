package leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestPalindromicSubstringTest {
    @Test
    fun example1() {
        assertEquals("aba", LongestPalindromicSubstring().longestPalindrome("babad"))
    }

    @Test
    fun example2() {
        assertEquals("bb", LongestPalindromicSubstring().longestPalindrome("cbbd"))
    }

    @Test
    fun example3() {
        assertEquals("a", LongestPalindromicSubstring().longestPalindrome("ac"))
    }

    @Test
    fun example4() {
        assertEquals("aca", LongestPalindromicSubstring().longestPalindrome("aacabdkacaa"))
    }
}
