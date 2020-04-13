package TwentyTwenty.April.HackerRank.Easy

//04-13-2020
//https://www.hackerrank.com/challenges/bon-appetit/problem
//10/10
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    var totalCost = 0
    for (i in 0..bill.size-1){
        if (i != k){
            totalCost += bill[i]
        }
    }
    val splitCost = totalCost/2
    if (splitCost == b){
        println("Bon Appetit")
    }
    else{
        val difference = b - splitCost
        println(difference)
    }
}

fun main(args: Array<String>) {
    bonAppetit(arrayOf(3, 10, 2, 9), 1, 7)
}