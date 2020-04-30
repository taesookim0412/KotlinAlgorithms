package TwentyTwenty.April.HackerRank.Easy

//04-29-2020
//https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
//15/15

fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
    var e = 100
    var idx = 0
    do{
        if (c[idx % c.size] == 1) e-=2
        idx = (idx + k) % c.size
        e--
    } while (e > 0 && idx != 0)
    return e
}


fun main(args: Array<String>) {
    println(jumpingOnClouds(arrayOf(0, 0, 1, 0 , 0, 1, 1, 0), 2))
}