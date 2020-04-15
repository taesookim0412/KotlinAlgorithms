package TwentyTwenty.April.HackerRank.Easy


//04-15-2020
//15/15
//https://www.hackerrank.com/challenges/electronics-shop/problem
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var closestSum = -1
    var closestACandidate = -1
    var closestBCandidate = -1
    for (i in 0..keyboards.size-1){
        for (j in 0..drives.size-1){
            val sum = keyboards[i] + drives[j]
            if (sum > closestSum && sum <= b) {
                closestSum = sum
                closestACandidate = i
                closestBCandidate = j
            }
        }
    }
    return closestSum
}

fun main(args: Array<String>) {
    //9
    println(getMoneySpent(arrayOf(3, 1), arrayOf(5, 2, 8), 10))
    println(getMoneySpent(arrayOf(4), arrayOf(5), 5))
}