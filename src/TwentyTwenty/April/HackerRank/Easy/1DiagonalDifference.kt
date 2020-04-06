package TwentyTwenty.April.HackerRank.Easy

import java.lang.Math.abs

//4-6-2020
//Difficulty: Easy
//Score: 10/10
//https://www.hackerrank.com/challenges/diagonal-difference/problem
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    val n = arr.size
    var leftDiag = 0
    var rightDiag = 0
    for (i in 0..n-1){
        leftDiag += arr[i][i]
        rightDiag += arr[i][n-1-i]
    }
    @Suppress("RemoveRedundantQualifierName")
    return Math.abs(leftDiag - rightDiag)
}


//Input: Array<Array<Int>>
//Output: 15
fun main(){
    println(diagonalDifference(arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))))
}