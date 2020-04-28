package TwentyTwenty.April.HackerRank.Easy

import TwentyTwenty.April.HackerRank.Library.Library
import java.util.*

//04-27-2020
//https://www.hackerrank.com/challenges/circular-array-rotation
//20/20
//https://www.hackerrank.com/challenges/circular-array-rotation/problem


fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    var k = k % a.size
    var newArray = Array<Int>(a.size){0}
    for (i in 0..a.size-1){
        newArray[(i+k) % a.size] = a[i]
    }
    for (i in 0..queries.size-1){
        queries[i] = newArray[queries[i]]
    }
    return queries
}

//Non-mod
/*fun circularArrayRotationOld(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    var k = k
    var newArray = Array<Int>(a.size){0}
    k = k % a.size
    var upperLimit = newArray.size-k-1
    for (i in 0..upperLimit){
        newArray[k + i] = a[i]
    }
    for (i in upperLimit+1..a.size-1){
        newArray[i - upperLimit - 1] = a[i]
    }
    for (i in 0..queries.size-1){
        queries[i] = newArray[queries[i]]
    }
    return queries
}*/


fun main(args: Array<String>) {
    //2, 3, 1
    println(Arrays.toString(circularArrayRotation(arrayOf(1, 2, 3), 2, arrayOf(0, 1, 2) )))
    println(Arrays.toString(circularArrayRotation(Library.arrayify("39356 87674 16667 54260 43958 70429 53682 6169 87496 66190 90286 4912 44792 65142 36183 43856 77633 38902 1407 88185 80399 72940 97555 23941 96271 49288 27021 32032 75662 69161 33581 15017 56835 66599 69277 17144 37027 39310 23312 24523 5499 13597 45786 66642 95090 98320 26849 72722 37221 28255 60906"), 51, arrayOf(47, 10))))
}