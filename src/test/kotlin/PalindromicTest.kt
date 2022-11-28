import org.junit.Test

class PalindromicTest {

    @Test
    fun `should get next palindromic of two digits`() {
        kotlin.test.assertEquals(22, Palindromic.getNext(12))
    }

    @Test
    fun `should get next palindromic of three digits`() {
        kotlin.test.assertEquals(191, Palindromic.getNext(188))
    }

    @Test
    fun `should get next palindromic of four digits`() {
        kotlin.test.assertEquals(2552, Palindromic.getNext(2541))
    }

    @Test
    fun `should get next palindromic with different number of digits`() {
        kotlin.test.assertEquals(101, Palindromic.getNext(99))
    }

}