package TwentyTwenty.May.HackerRank.Easy

//05-02-2020
//I realize you can use calendar util
//https://www.hackerrank.com/challenges/library-fine/problem
//"Library Fine"
//15/15
fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {
    if (y1 < y2) return 0
    if (y1 > y2) return 10000
    if (m1 < m2) return 0
    if (m1 == m2 && d1 <= d2) return 0
    if (m1 > m2) return 500 * (m1-m2)
    if (d1 > d2) return 15 * (d1-d2)
    return -1
}

fun main(args: Array<String>) {
    //45
    println(libraryFine(9, 6, 2015, 6, 6, 2015))
}