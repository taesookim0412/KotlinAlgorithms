package TwentyTwenty.April

import java.util.*


//2020-04-04
var intDataSet: Array<Int?> = arrayOfNulls(6)
fun main() {
    for (i in (0..(intDataSet?.size - 1))) {
        intDataSet[i] = i
    }
    intDataSet = shuffleYates(intDataSet)
    println(Arrays.toString(intDataSet))
}

fun shuffleYates(intDataSet: Array<Int?>): Array<Int?> {
    for (i in ((intDataSet.size - 1) downTo 0)) {
        val randNum = (0..i).random()
        val temp = intDataSet[i]
        intDataSet[i] = intDataSet[randNum]
        intDataSet[randNum] = temp
    }
    return intDataSet
}