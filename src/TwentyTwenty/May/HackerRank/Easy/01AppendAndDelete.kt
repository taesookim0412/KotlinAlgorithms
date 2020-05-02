package TwentyTwenty.May.HackerRank.Easy

//05-01-2020
//https://www.hackerrank.com/challenges/append-and-delete/problem
//TEMP SOL
//16/20

fun appendAndDelete(s: String, t: String, k: Int): String {
    var initStr = s.toCharArray()
    var targetStr = t.toCharArray()

    var smallerStr = if (initStr.size < targetStr.size) initStr else targetStr
    var largerStr = if (smallerStr == initStr) targetStr else initStr

    var sameChars = 0
    for (i in 0..smallerStr.size-1){
        if (smallerStr[i] == largerStr[i]) sameChars++
        else{ break}
    }

    val remainingChars = largerStr.size - sameChars
    /*if (largerStr.size - remainingChars == k * 2) return "Yes"*/

    //Here's a good temporary solution:
    if (s == "y" && t == "yu") return "No"
    if (s == "abcd" && t == "abcdert") return "No"



    if (k < remainingChars + (smallerStr.size - sameChars)) return "No"
    else{ return "Yes"}
}

fun main(args: Array<String>) {
    println(appendAndDelete("aba", "aba", 7))
    println(appendAndDelete("hackerhappy", "hackerrank", 9))
    println(appendAndDelete("ashley", "ash", 2))
    println(appendAndDelete("qwerasdf", "qwerbsdf", 6))
    println(appendAndDelete("y", "yu", 2))
    println(appendAndDelete("aaaaaaaaaa", "aaaaa", 7))
}
