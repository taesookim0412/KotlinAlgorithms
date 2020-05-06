package TwentyTwenty.May.HackerRank.Easy

import kotlin.math.ceil

//05-06-2020
//https://www.hackerrank.com/challenges/repeated-string/problem
fun repeatedString(s: String, n: Long): Long {
/*while (loopIdx != n){
        if (strIdx == s.length) strIdx = 0
        if (cStr[strIdx] == 'a') occurrences++
        strIdx++;loopIdx++
    }*/
    //Case: n=10, size = 3
    //LCF: 3 % 10 => 3*4 % 10 = 2 = k
    //Scan 0-kth element for occurences++
    //backwards occurences = no *2 loop
    var occurrences:Long = 0
    var cStr = s.toCharArray()



    for (i in 0..cStr.size-1){
        if (cStr[i] == 'a') occurrences++
    }


    var LCF = (Math.floor((n / s.length).toDouble())).toLong()
    var substrOcc:Long = 0
    for (i in 0..cStr.size-1){
        if (cStr[i] == 'a') substrOcc++
    }
    substrOcc *= LCF
    var diff = (n - (LCF * s.length)).toInt()
    var idx = 0
    while (diff != 0){
        if (idx == cStr.size) idx = 0
        if (cStr[idx++] == 'a') substrOcc++
        diff--
    }
    return substrOcc
}

fun main(args: Array<String>) {
    println(repeatedString("aba", 10))
    println(repeatedString("a", 1000000000000))
    println(repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 549382313570))
}