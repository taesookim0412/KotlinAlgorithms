package TwentyTwenty.May.HackerRank.Easy

import TwentyTwenty.April.HackerRank.Library.Library
import java.util.*

//05-02-2020
//https://www.hackerrank.com/challenges/cut-the-sticks/problem
//25/25
fun cutTheSticks(arr: Array<Int>): Array<Int> {
    arr.sort()
    var res = mutableListOf<Int>()

    var lastNum = 0
    var cutSum = 0
    var numIdxs = 0
    for (i in 0..arr.size-1){
        if (arr[i] == lastNum) {
            numIdxs++
            continue
        }
        cutSum += arr[i] - lastNum
        lastNum = arr[i]
        res.add(arr.size - numIdxs)
        numIdxs++
    }
    return res.toTypedArray()
}

fun main(args: Array<String>) {
    println(Arrays.toString(cutTheSticks(Library.arrayify("1 2 3 4 3 3 2 1"))))
}