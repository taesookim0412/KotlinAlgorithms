package TwentyTwenty.April.HackerRank.Easy

//04-12-2020
//10/10
/// 6 min 30 sec
//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var divisibleCt = 0
    for (i in 0..ar.size-1){
        for (j in i..ar.size-1){
            if (i != j) {
                val sum = ar[i] + ar[j]
                if (sum % k == 0){
                    divisibleCt++
                }
            }
        }
    }
    return divisibleCt

}

fun main(args: Array<String>) {
    println(divisibleSumPairs(6, 3, (arrayOf(1, 3, 2, 6, 1, 2))))
}