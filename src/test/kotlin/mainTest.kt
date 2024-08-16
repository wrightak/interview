import org.example.containsUnique
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class mainTest {
    @Test
    fun testContainsUnique() {
        assertTrue { containsUnique("abcd") }
        assertFalse { containsUnique("aa") }
        assertFalse { containsUnique("abcdefa") }
    }

    @Test
    fun testIsPermutation() {
        assertTrue { isPermutation("abcd", "dcba") }
        assertFalse { isPermutation("abcd", "dcb") }
        assertFalse { isPermutation("abcd", "dcbp") }
        assertFalse { isPermutation("abcd", "ddda") }
    }

    @Test
    fun testURLify() {
        assertEquals("Mr%20John%20Smith", URLify("Mr John Smith     ", 13))
    }

}
