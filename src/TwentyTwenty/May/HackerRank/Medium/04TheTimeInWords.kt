package TwentyTwenty.May.HackerRank.Medium

//05-06-2020
//https://www.hackerrank.com/challenges/the-time-in-words/problem

//Who even speaks like thes?
fun timeInWords(h: Int, m: Int): String {
    var minStr = when (m){
        0 -> "o' clock"
        15 -> "quarter"
        45 -> "quarter"
        else -> return "this algorithm to the bank because this one is LOADED"
    }
    return "ihateyou"
}


fun main(args: Array<String>) {
    println(timeInWords(7, 15))
}