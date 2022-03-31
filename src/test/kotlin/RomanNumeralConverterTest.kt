import org.junit.Test
import kotlin.test.assertEquals


class RomanNumeralConverterTest {

    private val converter = RomanNumeralConverter()

    @Test
    fun intToRomanTest() {
        assertEquals("I", converter.intToRoman(1))
        assertEquals("IV", converter.intToRoman(4))
        assertEquals("VII", converter.intToRoman(7))
        assertEquals("IX", converter.intToRoman(9))
        assertEquals("XII", converter.intToRoman(12))
        assertEquals("LXVIII", converter.intToRoman(68))
        assertEquals("MCMLXXXVI", converter.intToRoman(1986))
        assertEquals("MMXXII", converter.intToRoman(2022))
    }

    @Test
    fun romanToIntTest() {
        assertEquals(converter.romanToInt("I"), 1)
        assertEquals(converter.romanToInt("IV"),4)
        assertEquals(converter.romanToInt("VII"), 7)
        assertEquals(converter.romanToInt("IX"), 9)
        assertEquals(converter.romanToInt("XII"),12)
        assertEquals(converter.romanToInt("LXVIII"), 68)
        assertEquals(converter.romanToInt("MCMLXXXVI"), 1986)
        assertEquals(converter.romanToInt("MMXXII"), 2022)
    }

    @Test
    fun bigIterationTest() {
        for (i in 0..99999) {
            val roman = converter.intToRoman(i)
            val int = converter.romanToInt(roman)
            assertEquals(int, i)
        }
    }

    @Test(expected = java.lang.IllegalArgumentException::class)
    fun exceptionTest() {
        converter.romanToInt("y")
    }

}