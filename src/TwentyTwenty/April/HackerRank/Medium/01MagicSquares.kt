package TwentyTwenty.April.HackerRank.Medium

import java.util.*

//04-18-2020
//20/20
//https://www.hackerrank.com/challenges/magic-square-forming/problem

var magicSquares = arrayOf(
    arrayOf(arrayOf(2, 7, 6), arrayOf(9, 5, 1), arrayOf(4, 3, 8)),
    arrayOf(arrayOf(2, 9, 4), arrayOf(7, 5, 3), arrayOf(6, 1, 8)),
    arrayOf(arrayOf(4, 3, 8), arrayOf(9, 5, 1), arrayOf(2, 7, 6)),
    arrayOf(arrayOf(4, 9, 2), arrayOf(3, 5, 7), arrayOf(8, 1, 6)),
    arrayOf(arrayOf(6, 1, 8), arrayOf(7, 5, 3), arrayOf(2, 9, 4)),
    arrayOf(arrayOf(6, 7, 2), arrayOf(1, 5, 9), arrayOf(8, 3, 4)),
    arrayOf(arrayOf(8, 1, 6), arrayOf(3, 5, 7), arrayOf(4, 9, 2)),
    arrayOf(arrayOf(8, 3, 4), arrayOf(1, 5, 9), arrayOf(6, 7, 2)))

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    var lowestCost = Integer.MAX_VALUE
    for (h in 0..magicSquares.size-1){
        var costCandidate = 0
        for (i in 0..magicSquares[h].size-1){
            for (j in 0..magicSquares[h][i].size-1){
                costCandidate += Math.abs(magicSquares[h][i][j] - s[i][j])
            }

        }
        if (costCandidate < lowestCost) lowestCost = costCandidate
    }
    return lowestCost
}

fun main(args: Array<String>) {
    println(formingMagicSquare(arrayOf(arrayOf(4, 9, 2), arrayOf(3, 5, 7), arrayOf(8, 1, 5))))
}