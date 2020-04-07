package TwentyTwenty.April.HackerRank.Easy

import java.text.DecimalFormat

//04-07-2020
//https://www.hackerrank.com/challenges/plus-minus/problem
//Score: 10/10

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    var pos:Double = 0.0
    var neg:Double = 0.0
    var zero:Double = 0.0
    for (i in 0..arr.size-1){
        if (arr[i] > 0) pos++
        else if (arr[i] == 0) zero++
        else if (arr[i] < 0) neg++
    }
    val decimalFormat = DecimalFormat("###.#######")

    println(decimalFormat.format(pos / arr.size).toString())
    println(decimalFormat.format(neg / arr.size).toString())
    println(decimalFormat.format(zero / arr.size).toString())



}

//Positive, Negative, and Zero
fun main(args: Array<String>) {
    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
}

//Summary: Input [-4 3 -9 0 4 1]
//Output:
//0.500000
//0.333333
//0.166667

//True output:
//0.5
//0.3333333
//0.1666667
