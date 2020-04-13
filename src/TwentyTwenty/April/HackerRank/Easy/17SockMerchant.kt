package TwentyTwenty.April.HackerRank.Easy

import java.util.*

//04-13-2020
//https://www.hackerrank.com/challenges/sock-merchant/problem
//Constraint: 1<= ar[i] <= 100
//between 1-100 elems inclusive
//Score: 10/10
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    ar.sort()
    var socksArray = Array<Int>(101){0}
    for (i in 0..ar.size-1){
        socksArray[ar[i]]++
    }
    var pairs = 0
    var prevElement = 0
    /*println(Arrays.toString(socksArray))
    println(Arrays.toString(ar))*/

    for (i in 0..ar.size-1){
        if (ar[i] == prevElement) continue
        pairs += socksArray[ar[i]] / 2
        prevElement = ar[i]
    }
    return pairs
}

fun main(args: Array<String>) {
    println(sockMerchant(9, arrayOf(10,20,20,10,10,30,50,10,20)))
    //Size of 101 == fits 100 index elements
    println(sockMerchant(1, arrayOf(100)))


}