package TwentyTwenty.April.HackerRank.Easy


//04-21-2020
//20/20
//https://www.hackerrank.com/challenges/utopian-tree/problem

fun utopianTree(n: Int): Int {
    var height = 1
    for (i in 1..n){
        height = if (i % 2 != 0) height * 2 else height +1
    }
    return height
}

//n=0 unchanged
//n = 1 spring = double height
//n = 2 summer = height+1
fun main(args: Array<String>) {
    println(utopianTree(1))
    println(utopianTree(2))
    println(utopianTree(3))

}