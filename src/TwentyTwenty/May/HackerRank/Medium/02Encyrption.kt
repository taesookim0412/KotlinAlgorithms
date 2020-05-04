package TwentyTwenty.May.HackerRank.Medium

import java.util.*

fun encryption(s: String): String {
    var sqrt = Math.sqrt(s.length.toDouble())
    var charMtx = Array<Array<Char>>(Math.floor(sqrt).toInt()) {
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
            println(s[charIdx])
            charIdx++
        }
    }
    charMtx.forEach{ chars  -> println(Arrays.toString(chars))}
    return ""
}

fun main(args: Array<String>) {
    println(encryption("if man was meant to stay on the ground god would have given us roots"))
}