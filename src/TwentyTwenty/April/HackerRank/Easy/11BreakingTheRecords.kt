package TwentyTwenty.April.HackerRank.Easy

import java.util.*

//4-11/2020
//10/10
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var brokenMax = 0
    var brokenMin = 0
    var lastMax = scores[0]
    var lastMin = scores[0]
    for (i in 0..scores.size - 1) {
        if (scores[i] > lastMax) {
            lastMax = scores[i]
            brokenMax++
        } else if (scores[i] < lastMin) {
            lastMin = scores[i]
            brokenMin++
        }
    }
    return arrayOf(brokenMax, brokenMin)

}

fun main(args: Array<String>) {
    println(Arrays.toString(breakingRecords(arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42))))
}