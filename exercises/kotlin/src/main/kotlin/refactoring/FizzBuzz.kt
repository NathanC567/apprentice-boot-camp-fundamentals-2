package refactoring

internal class FizzBuzz {
    private var counter = 0
    private var fizzDivisor = 0
    private var buzzDivisor: Int = 5
    fun calculateFizzbuzz(): String {
        var fizzBuzzString = ""
        val sequenceLength = 100
        while (counter < sequenceLength) {
            fizzBuzzString += isValueFizzbuzz(counter) + " "
            counter++
        }
        return fizzBuzzString.substring(0, fizzBuzzString.length - 1)
    }

    private fun isValueFizzbuzz(foo: Int): String {
        fizzDivisor++
        buzzDivisor--
        val addCurrentInt = (foo + 1).toString()
        var result = if (fizzDivisor == 3 || buzzDivisor == 0) "" else addCurrentInt
        if (fizzDivisor == 3) result += decodeFizz()
        if (buzzDivisor == 0) result += decodeBuzz()
        return result
    }

    private fun decodeBuzz(): String {
        buzzDivisor = 5
        return decode("42757a7a")
    }

    private fun decodeFizz(): String {
        fizzDivisor = 0
        return decode("46697a7a")
    }

    companion object {
        fun decode(input: String): String {
            return String(input.chunked(2)
                .map { it.toInt(16).toChar() }
                .toCharArray())
        }
    }
}