package TwentyTwenty.April.HackerRank.Easy

//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
//Score: 10.10
fun birthdayCakeCandles(ar: Array<Int>): Int {
    var highestNum = ar[0]
    var occurences = 0
    for (i in 0..ar.size-1){
        if (ar[i] > highestNum){
            highestNum = ar[i]
            occurences = 1
        }
        else if (ar[i] == highestNum){
            occurences++
        }
    }
    return occurences
}

//Output: 2 tallest candles
fun main(){
    println(birthdayCakeCandles(arrayOf(3, 2, 1, 3)))
}