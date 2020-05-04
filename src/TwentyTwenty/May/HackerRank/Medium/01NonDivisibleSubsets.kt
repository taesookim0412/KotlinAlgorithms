package TwentyTwenty.May.HackerRank.Medium

import TwentyTwenty.April.HackerRank.Library.Library
import java.util.*

//05-03-2020
//https://www.hackerrank.com/challenges/non-divisible-subset/problem
//Idk what I'm looking at.

fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
    var newArray = Array<Int>(k){0}
    //obtain remainder pair
    for (i in 0..s.size-1){
        var elem = s[i] % k
        newArray[elem]++
    }
    println(Arrays.toString(newArray))
    var max = 0
    for (i in 0..newArray.size-1){
        if (newArray[i] > max) max = newArray[i]
    }
    return max
}

fun main(args: Array<String>) {
println(nonDivisibleSubset(3, arrayOf(1, 7, 2, 4)))
    println(nonDivisibleSubset(4, arrayOf(19, 10, 12, 10, 24, 25, 22)))

    //11
    println(nonDivisibleSubset(7, Library.arrayify("278 576 496 727 410 124 338 149 209 702 282 718 771 575 436")))
}