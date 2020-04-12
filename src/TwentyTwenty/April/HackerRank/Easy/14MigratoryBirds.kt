package TwentyTwenty.April.HackerRank.Easy

import java.util.*

//04-12-2020
//10/10
//17min?
//https://www.hackerrank.com/challenges/migratory-birds/
fun migratoryBirds(arr: Array<Int>): Int {
    arr.sort()
    var highestSighted = arr[arr.size-1]
    var highestCt = 1

    var sightCt = 1
    var mostFreqCand = arr[arr.size-1]
    for (i in arr.size-2 downTo 0){
        if (arr[i] == mostFreqCand) sightCt++
        else{
            sightCt = 1
        }
        if (sightCt >= highestCt){
            highestCt = sightCt
            highestSighted = mostFreqCand
        }
        mostFreqCand = arr[i]
    }
    return highestSighted
}

fun main(args: Array<String>) {
    println(migratoryBirds(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)))
}