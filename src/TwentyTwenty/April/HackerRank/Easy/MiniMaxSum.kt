package TwentyTwenty.April.HackerRank.Easy

// Complete the miniMaxSum function below.
//Score: 10/10
//https://www.hackerrank.com/challenges/mini-max-sum/problem
fun miniMaxSum(arr: Array<Int>): {
    var biggestNum:Long = arr[0].toLong()
    var smallestNum:Long = arr[0].toLong()
    var sum:Long = 0
    for (i in 0..arr.size-1){
        if (arr[i] > biggestNum) biggestNum = arr[i].toLong()
        if (arr[i] < smallestNum) smallestNum = arr[i].toLong()
        sum += arr[i].toLong()
    }
    println((sum - biggestNum).toString() + " " + (sum - smallestNum).toString())
}

//Output: 10 14 (Min, Max) of elems-1
fun main(args: Array<String>) {
    miniMaxSum(arrayOf(1, 2, 3, 4, 5))
}