package TwentyTwenty.April.HackerRank.Easy

//04-09-2020
//Score: 10/10
//https://www.hackerrank.com/challenges/apple-and-orange/problem

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>){
    var applesCt = 0
    for (i in 0..apples.size-1){
        val offset = a + apples[i]
        if (offset in s..t){
            applesCt++
        }
    }
    var orangesCt = 0
    for (i in 0..oranges.size-1){
        val offset = b+ oranges[i]
        if (offset in s..t){
            orangesCt++
        }
    }
    println(applesCt)
    println(orangesCt)
}

//Output: 1, 1
fun main(args: Array<String>) {
    countApplesAndOranges(7, 11, 5, 15, arrayOf(-2, 2, 1), arrayOf(5, -6))
}