package TwentyTwenty.May.LeetCode.ThirtyDayChallenge

//05-09-2020
//Runtime: 196 ms, faster than 16.19% of Kotlin online submissions for Last Stone Weight.
//Memory Usage: 34.7 MB, less than 100.00% of Kotlin online submissions for Last Stone Weight.
//https://leetcode.com/problems/last-stone-weight/submissions/

fun lastStoneWeight(stones: IntArray): Int {
    if (stones.size == 1) return stones[0]
    stones.sortDescending()
    var stonesList = stones.toMutableList()

    while (stonesList.size > 1 ){
        //swap the highest two nums
        for (i in 0..stonesList.size-1){
            if (stonesList[i] > stonesList[0]) stonesList[i] = stonesList[0].also{ stonesList[0] = stonesList[i]}
        }
        for (i in 2..stonesList.size-1){
            if (stonesList[i] > stonesList[1]) stonesList[i] = stonesList[1].also{ stonesList[1] = stonesList[i]}
        }
        println(stonesList.toString())
                when{
            stonesList[0] == stonesList[1] -> {
                stonesList.removeAt(0)
                stonesList.removeAt(0)
            }
            stonesList[0] > stonesList[1] -> {
                stonesList[0] -= stonesList[1]
                stonesList.removeAt(1)
            }
        }
    }
    if (stonesList.size == 0) return 0
    return stonesList[0]
}

fun main(){
    //2
    println(lastStoneWeight(intArrayOf(3, 7, 2)))
    println(lastStoneWeight(intArrayOf(2, 7, 5, 1, 8, 1)))
    println(lastStoneWeight(intArrayOf(7,6,7,6,9)))
    println(lastStoneWeight(intArrayOf(1)))
}