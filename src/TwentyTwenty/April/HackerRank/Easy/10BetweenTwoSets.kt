package TwentyTwenty.April.HackerRank.Easy

import java.util.*
import java.util.Arrays.copyOf


//Read it wrong
/*fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    //scan both arrays
    //I can just concatenate both arrays and solve it that way
    //However I'm trying to be memory efficient and work in place
    val aArrayCands = returnScanBothArraysCandSize(a, b)
    println(aArrayCands)
    val bArrayCands = returnScanBothArraysCandSize(b, a, true)
    println(bArrayCands)
    return aArrayCands+bArrayCands
}

private fun returnScanBothArraysCandSize(
    a: Array<Int>,
    b: Array<Int>,
    invert: Boolean = false
): Int {
    var aArrayCand = mutableListOf<Int>()

    for (i in 0..a.size - 1) {
        var isAValid = true
        for (j in i..a.size - 1) {
            if (a[j] % a[i] != 0) isAValid = false
        }
        var isBValid = true
        if (invert == false) {
            for (j in 0..b.size - 1) {
                if (b[j] % a[i] != 0) isBValid = false
            }
        }
        //This is inverted, for f(x)2
        //a2 elems vals > a1 elems vals
        else if (invert == true){
            for (j in 0..b.size-1){
                if (a[i] % b[j] != 0) isBValid = false
            }
        }
        if (isAValid == true && isBValid == true) {
            aArrayCand.add(a[i])
            println("Here's a candidate: " + a[i])
        }
    }
    return aArrayCand.size
}*/


//04-10-2020
//Score: 10/10
//Explanation Rating: 0/10
//https://www.hackerrank.com/challenges/between-two-sets/

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    //Need to sort because there is no constraint
    a.sort()
    b.sort()
    //Also need to make sure a[size-1] < b[0]
    if (a[a.size-1] > b[0]){
        return getFactorCt(b, a)

    }

    return getFactorCt(a, b)

}

private fun getFactorCt(a: Array<Int>, b: Array<Int>): Int {
    var factorCt = 0
    //for each multiple:
    for (i in a[a.size - 1]..b[0] step a[a.size-1]) {
        //check if its a factor of each a1
        var isAValid = true
        for (j in 0..a.size-1){
            if (i % a[j] != 0) isAValid = false
        }
        val newFactor = i
        var isBValid = true
        for (j in 0..b.size - 1) {
            if (b[j] % newFactor != 0) isBValid = false
        }
        if (isAValid && isBValid) factorCt++
    }

    return factorCt
}


fun main(args: Array<String>) {
    //0->3
    println(getTotalX(arrayOf(2, 4), arrayOf(16, 32, 96)))

    //o-> 0
    println(getTotalX(arrayOf(100, 99, 98, 97, 96, 95, 94, 93, 92, 91), arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))

    //0->1
    println(getTotalX(arrayOf(2), arrayOf(20, 30, 12)))

    //2?
    println(getTotalX(arrayOf(3, 4), arrayOf(24, 48)))
}