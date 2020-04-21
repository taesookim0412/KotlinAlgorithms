package TwentyTwenty.April.HackerRank.Library

import java.util.*

// So in order to test algorithms we're actually going to create an algorithm
// in order to use these test cases
class Library{
    companion object {
        fun arrayify(string: String): Array<Int> {
            var strs = string.split(" ")
            var intArray = strs.map { it.toInt() }.toTypedArray()
            return intArray
        }
    }
}