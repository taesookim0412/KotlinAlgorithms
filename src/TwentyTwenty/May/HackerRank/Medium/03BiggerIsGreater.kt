package TwentyTwenty.May.HackerRank.Medium

import java.util.*

//05-05-2020
//Passes in my book
//https://www.hackerrank.com/challenges/bigger-is-greater/problem

fun biggerIsGreater(w: String): String {
    var cStr = w.toCharArray()

    //abdc -> acbd instead of acdb (smallest word)
    //0132 -> 0213 instead of 0231
    //0132 -> 0231 -> 0213
    //Take the int approach
    //abcd -> abdc
    //0123 -> 0132
    //ba -> ba
    //10 -> 10

    var iStr = Array<Int>(cStr.size) { 0 }
    w.mapIndexed { i, c ->
        iStr[i] = c.toInt()
    }


    var highestElement = -1
    var highestPair = -1
    for (i in 0..iStr.size-1) {
        for (j in i + 1..iStr.size - 1) {
            if (iStr[j] > iStr[i]) {
                if (highestElement == -1) highestElement = i
                if (highestPair == -1) highestPair = j
                if (i > highestElement) highestElement = i
                if (j > highestPair) highestPair = j
            }
        }
    }
    if (highestElement == -1 && highestPair == -1) return "no answer"

    //got the highest i element now swap between i element and j element
    var temp = iStr[highestPair]
    iStr[highestPair] = iStr[highestElement]
    iStr[highestElement] = temp


    if (highestElement != -1) {
        for (i in highestElement+1..iStr.size - 1) {
            for (j in i + 1..iStr.size - 1) {
                if (iStr[j] < iStr[i]) {
                    var temp = iStr[j]
                    iStr[j] = iStr[i]
                    iStr[i] = temp
                }
            }
        }
    }
    var retuStr = Array<Char>(iStr.size) { 0.toChar() }
    iStr.mapIndexed { i, num ->
        retuStr[i] = num.toChar()
    }
    var str = retuStr.joinToString("")
    if (str == w) return "no answer"
    return retuStr.joinToString("")
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

    var stra = biggerIsGreater("zedawdvyyfumwpupuinbdbfndyehircmylbaowuptgmw")
    println(stra == "zedawdvyyfumwpupuinbdbfndyehircmylbaowuptgwm")
    println(biggerIsGreater("zyyxwwtrrnmlggfeb"))
}

//GARBAGE IN GARBAGE OUT
/*var foundPair = false
var foundIdx = -1*/
/*for (i in iStr.size - 1 downTo 0) {
    for (j in i - 1 downTo 0) {
        if (iStr[j] < iStr[i]) {
            //found an occurence
            var temp = iStr[j]
            iStr[j] = iStr[i]
            iStr[i] = temp
            foundIdx = if (j + 1 == iStr.size) -1 else j + 1
            foundPair = true
            break
        }
    }
    if (foundPair) break
}*/
/*for (i in iStr.size - 1 downTo 0) {
    var smallestLargerCharIdx = i
    for (j in i..iStr.size-1) {
        if (iStr[j] > iStr[i]) {
            if (smallestLargerCharIdx == i) smallestLargerCharIdx = j
            if (iStr[j] < iStr[smallestLargerCharIdx]) smallestLargerCharIdx = j
            //found an occurence
            foundIdx = if (j + 1 == iStr.size) -1 else (i + 1)
            foundPair = true
            break
        }
    }
    if (foundPair) {
        var temp = iStr[smallestLargerCharIdx]
        iStr[smallestLargerCharIdx] = iStr[i]
        iStr[i] = temp
        break
    }
}*/

//new approach
// Scan to see if there is a swap that would increase its value
// the lowest increase greater would be require check from end , see if there's occurence highest element#
/*var swapOffset = 1
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

}*/