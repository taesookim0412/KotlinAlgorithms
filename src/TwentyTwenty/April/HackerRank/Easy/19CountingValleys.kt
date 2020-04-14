package TwentyTwenty.April.HackerRank.Easy


//04-14-2020
//15/15
//Recursive traversal
// Early early early
//Woke up at 2AM
//https://www.hackerrank.com/challenges/counting-valleys/problem

fun countingValleys(n: Int, s: String): Int {
    return traverseHike(s)

}

fun traverseHike(s:String,
                 sIdx: Int = 0,
                 valleyCt:Int = 0,
height:Int = 0,
pathOfAscent: Boolean = false): Int{
    var newValleyCt = valleyCt
    if (height == 0 && pathOfAscent) newValleyCt++
    /*println(height)*/
    if (sIdx == s.length) return newValleyCt

    var heightOffset = 0
    if (s[sIdx] == 'D') heightOffset--
    else if (s[sIdx] == 'U') heightOffset++
    var newPath:Boolean =
        when (heightOffset){
            1 -> true
            -1 -> false
            else -> false
        }

    return traverseHike(s, sIdx+1, newValleyCt, height+ heightOffset, newPath)
}

fun main(args: Array<String>) {
    println(traverseHike("UDDDUDUU"))

}