package TwentyTwenty.April.HackerRank.Easy

import TwentyTwenty.April.HackerRank.Library.Library
import java.util.*


//https://www.hackerrank.com/challenges/permutation-equation/problem
//04-28-2020
//20/20

fun permutationEquation(p: Array<Int>): Array<Int> {
    var numsIdxs = Array<Int>(p.size) { 0 }

    //Pair indexes with a seperate array of nums
    p.mapIndexed { idx, num ->
        numsIdxs[num-1] = idx
    }

    var newArr: Array<Int> = numsIdxs.foldIndexed(Array<Int>(p.size) { 0 }) { i, a: Array<Int>, num ->
        a[num] = p[i]
        return@foldIndexed a
    }
    var newP: Array<Int> = Array<Int>(p.size) {0}
    for (i in 0..newP.size-1){
        newP[i] = numsIdxs[numsIdxs[i]] + 1
    }
    return newP
}


fun main(args: Array<String>) {
    println(Arrays.toString(permutationEquation(arrayOf(2, 3, 1))))
    println(Arrays.toString(permutationEquation(arrayOf(1, 3, 5, 1, 2))))
}