package TwentyTwenty.May.LeetCode.ThirtyDayChallenge

//05-09-2020
//https://leetcode.com/problems/single-number/
//Runtime: 396 ms, faster than 10.98% of Kotlin online submissions for Single Number.
//Memory Usage: 45.8 MB, less than 12.50% of Kotlin online submissions for Single Number.
//No extra constraints, unable to optimize further without linear complexity + no extra memory


fun singleNumber(nums: IntArray): Int {
    nums.sort()
    if (nums.size == 1) return nums[0]
    if (nums[0] != nums[1]) return nums[0]
    for (i in 1..nums.size-1){
        if (nums[i-1] != nums[i] && i % 2 != 0) return nums[i - 1]
    }
    if (nums.size % 2 != 0) return nums[nums.size-1]
    return -1
}
fun main(){
    //1
    println(singleNumber(intArrayOf(2, 2, 1)))
    println(singleNumber(intArrayOf(1, 1, 2, 2, 3, 4, 4)))
}