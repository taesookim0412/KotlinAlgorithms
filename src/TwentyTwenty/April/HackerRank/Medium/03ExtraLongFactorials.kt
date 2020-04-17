package TwentyTwenty.April.HackerRank.Medium

import java.math.BigInteger

//04-17-2020
//e-z 20/20
//https://www.hackerrank.com/challenges/extra-long-factorials/problem
fun extraLongFactorials(n: Int): Unit {
    var longFactorial = BigInteger("1")
    for (i in n downTo 1) {
        longFactorial *= i.toBigInteger()
    }
    println(longFactorial)
}

fun main(args: Array<String>) {
    extraLongFactorials(25)
}