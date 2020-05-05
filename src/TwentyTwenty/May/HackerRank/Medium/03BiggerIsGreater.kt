package TwentyTwenty.May.HackerRank.Medium

import java.util.*

//05-04-2020
//Don't have time to study lexicographical order right now
//https://www.hackerrank.com/challenges/bigger-is-greater/problem
//Ok dude I have no idea what I'm doing on this problem anyways I'm going to skip this
//Legit digging a deeper hole

fun biggerIsGreater(w: String): String {
    var cStr = w.toCharArray()

    //abdc -> acbd instead of acdb (smallest word)
    //0132 -> 0213 instead of 0231
    //0132 -> 0231 -> 0213

    var swapOffset = 1
    for (i in 0..cStr.size-1){
        if (i+1 == cStr.size) break
        if (cStr[i+1].toInt() > cStr[i].toInt() + swapOffset){
            //find smallest int ahead then swap it
            var smallestInt = cStr[i+1].toInt()
            var intsIdx = i+1
            for (j in i+1..cStr.size-1){
                if (cStr[j].toInt() < smallestInt) {
                    smallestInt = cStr[j].toInt()
                    intsIdx = j
                }
            }
            // if a different character
            if (intsIdx > i+1){
                swapOffset = 0
                //swap
                var temp = cStr[intsIdx]
                cStr[intsIdx] = cStr[i]
                cStr[i] = temp
                continue
            }
        }
        if (cStr[i+1].toInt() < cStr[i].toInt()){
            var temp = cStr[i+1]
            cStr[i+1] = cStr[i]
            cStr[i] = temp
        }
    }
    if (swapOffset == 0) return cStr.joinToString("")


    for (i in cStr.size-1 downTo 0){
        if (i-1 < 0) break
        if (cStr[i-1].toInt() < cStr[i].toInt()){
            var temp = cStr[i-1]
            cStr[i-1] = cStr[i]
            cStr[i] = temp
            return cStr.joinToString("")
        }
    }

    return "no answer"
}

fun main(args: Array<String>) {
    //lmon
    println(biggerIsGreater("lmno"))
    //na
    println(biggerIsGreater("dcba"))
    //na
    println(biggerIsGreater("dcbb"))
    //acbd
    println(biggerIsGreater("abdc"))
    //abdc
    println(biggerIsGreater("abcd"))
    //fedcbabdc
    println(biggerIsGreater("fedcbabcd"))
}