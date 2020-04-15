package TwentyTwenty.April.HackerRank.Easy

//04-15-2020
//15/15
//https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
fun catAndMouse(x: Int, y: Int, z: Int): String {
    val catAMouseDist = Math.abs(x-z)
    val catBMouseDist = Math.abs(y-z)
    if (catAMouseDist == catBMouseDist) return "Mouse C"
    else if (catAMouseDist < catBMouseDist) return "Cat A"
    else if (catBMouseDist < catAMouseDist) return "Cat B"
    return ""
}

fun main(args: Array<String>) {
    println(catAndMouse(1, 2, 3))
    println(catAndMouse(1, 3, 2))
}