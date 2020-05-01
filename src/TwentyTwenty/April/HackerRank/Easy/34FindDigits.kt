package TwentyTwenty.April.HackerRank.Easy


//04-30-2020
//https://www.hackerrank.com/challenges/find-digits/problem
//25/25
fun findDigits(n: Int): Int {
    var ghostNum = n
    var sum = 0
    while (ghostNum > 0) {
        var num = ghostNum % 10
        ghostNum /= 10
        if (num != 0) if (n % num == 0) sum++
    }
    return sum
}

fun main(args: Array<String>) {
    println(findDigits(2))
    println(findDigits(12))
    println(findDigits(1012))
}