package TwentyTwenty.May.HackerRank.Easy

//05-02-2020
//20/20
//https://www.hackerrank.com/challenges/sherlock-and-squares/problem

fun squares(a: Int, b: Int): Int {
    var sqrs = 0
    var sqrRoot = 1
    var maxSqr = 1
    while (maxSqr < b){
        maxSqr = sqrRoot*sqrRoot
        if (maxSqr >= a && maxSqr <= b) sqrs++
        sqrRoot+= 1
    }
    return sqrs
}

fun main(args: Array<String>) {
    println(squares(3, 9))
}