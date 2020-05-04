package TwentyTwenty.May.HackerRank.Medium

import java.util.*

//05-03-2020
//30/30
//https://www.hackerrank.com/challenges/encryption/problem
fun encryption(s: String): String {
    var s = s.replace(" ", "")

    var sqrt = Math.sqrt(s.length.toDouble())
    var flrLim:Int = if (Math.floor(sqrt).toInt() * Math.ceil(sqrt).toInt() < s.length) Math.floor(sqrt).toInt() + 1 else Math.floor(sqrt).toInt()
    var charMtx = Array<Array<Char>>(flrLim) {
        Array<Char>(Math.ceil(sqrt).toInt()){0.toChar()}
    }
/*    var lowerSqr = Math.floor(sqrt)
    lowerSqr *= lowerSqr
    var lowerLim = (Math.abs(lowerSqr - s.length) + lowerSqr).toInt()
    println(lowerLim)*/
    var charIdx = 0
    for (i in 0..charMtx.size-1){
        for (j in 0..charMtx[i].size-1){
            if (charIdx >= s.length) break
            charMtx[i][j] = s[charIdx]
            charIdx++
        }
    }
    /*charMtx.forEach{ chars -> println(Arrays.toString(chars))}*/

    //Lower size is the row idx so it can be out of bounds
    var retStr = StringBuilder()
    //for each column
    for (j in 0..charMtx[0].size-1){
        //for each row
        for (i in 0..charMtx.size-1){
            if (charMtx[i][j] == 0.toChar()) continue
            retStr.append(charMtx[i][j])
        }
        retStr.append(" ")
    }


    return retStr.toString()
}

fun main(args: Array<String>) {
    println(encryption("haveabaddday"))
    println(encryption("if man was meant to stay on the ground god would have given us roots"))
    println(encryption("feedthedog"))
    println(encryption("chillout"))

}