package TwentyTwenty.April.HackerRank.Easy


//https://www.hackerrank.com/challenges/find-digits/problem
fun findDigits(n: Int): Int {
    var idx = 10
    do{
        //??
        var num = (n%idx) % idx
        println(num)
        idx *= 10
    }while(idx < n)
    return 929213
}

fun main(args: Array<String>) {
    println(findDigits(2))
    println(findDigits(1012))
}