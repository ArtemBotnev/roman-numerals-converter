

class RomanNumeralConverter {

    private val map by lazy {
        linkedMapOf(
            1000 to "M",
            900 to "CM",
            500 to "D",
            400 to "CD",
            100 to "C",
            90 to "XC",
            50 to "L",
            40 to "XL",
            10 to "X",
            9 to "IX",
            5 to "V",
            4 to "IV",
            1 to "I"
        )
    }

    private val invertedMap: Map<String, Int> by lazy { map.entries.associate { it.value to it.key } }

    fun intToRoman(num: Int): String {
        var n = num
        val builder = StringBuilder()
        while (n != 0) {
            for ((key, value) in map) {
                if (n % key != n) {
                    builder.append(value)
                    n -= key
                    break
                }
            }
        }
        return builder.toString()
    }

    @Throws(java.lang.IllegalArgumentException::class)
    fun romanToInt(roman: String): Int {
        var resut = 0
        var skipNext = false
        val charArray = roman.toList()
        val size = charArray.size
        for (i in charArray.indices) {
            if (skipNext) {
                skipNext = !skipNext
                continue
            }

            if (i + 1 < size) {
                val key = charArray.subList(i, i + 2).joinToString(separator = "")
                val value = invertedMap[key]
                if (value != null) {
                    resut += value
                    skipNext = !skipNext
                    continue
                }
            }

            val key = charArray[i].toString()
            val value = invertedMap[key]
            value?.let { resut += it } ?: throw IllegalArgumentException(
                "Entered symbol is $key, but allowed are: ${invertedMap.keys.filter { it.length < 2 }
                    .joinToString(separator = " ")}"
            )
        }

        return resut
    }
}