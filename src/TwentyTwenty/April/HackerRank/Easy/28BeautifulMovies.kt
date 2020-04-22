package TwentyTwenty.April.HackerRank.Easy

//15/15
//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
fun beautifulDays(i: Int, j: Int, k: Int): Int {
    var days = 0
    for (idx in i..j)
    {
        var strdx = idx.toString().reversed()

        if (Math.abs(idx - strdx.toInt()) % k == 0){
            days++
        }
    }
    return days


}

fun main(args: Array<String>) {
    println(beautifulDays(20, 23, 6))
}