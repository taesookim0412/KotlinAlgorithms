package TwentyTwenty.April.HackerRank.Easy

//04-21-2020
//https://www.hackerrank.com/challenges/the-hurdle-race/problem
//15/15
//speedracer
//library class creation

fun hurdleRace(k: Int, height: Array<Int>): Int {
    var minHeight = 0
    for (i in 0..height.size-1){
        if (height[i] > minHeight) minHeight = height[i]
    }
    if (minHeight < k) return 0
    return minHeight - k
}

fun main(args: Array<String>) {
    println(hurdleRace(4, arrayOf(1, 6, 3, 5, 2)))
}