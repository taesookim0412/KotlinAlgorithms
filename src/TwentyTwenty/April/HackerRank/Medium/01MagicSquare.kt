package TwentyTwenty.April.HackerRank.Medium

import java.util.*

//wip
//create recursive fun?
fun formingMagicSquare(s: Array<Array<Int>>): Int {
    //3x3 array of integers
    //for every row

    var rowSum = Array<Int>(3){0}
    var colSum = Array<Int>(3){0}
    var diagsSum = Array<Int>(2){0}

    for (i in 0..s.size-1){
        diagsSum[0] += s[i][i]
        diagsSum[1] += s[s.size-1-i][s.size-1-i]
        val matrixRow = s[i]
        for (j in 0..matrixRow.size-1) {
            rowSum[i] += matrixRow[j]
            colSum[j] += matrixRow[j]
        }
    }
    var avgs = 0
    for (i in rowSum.indices){
        avgs += rowSum[i]
    }
    for (i in colSum.indices){
        avgs += colSum[i]
    }
    for (i in diagsSum.indices){
        avgs += diagsSum[i]
    }
    //magic constant
    avgs /= 8
    var magicConstant = avgs

    //Recursively alter this
    for (i in rowSum.indices){
        if (rowSum[i] != magicConstant){
            for (j in s[i].indices){
                //Perform the minimum cost operation here :
                //I.E change based on whether on not it affects the Column Sum
                //Do the diagonals later
                //performRowChangeAndCalculate()
                //performColChangeAndCalculate()
                //performDiagChangeAndCalculate()
                //while != magicconstant forall
                //idk im busy

            }
        }
    }















    println(Arrays.toString(rowSum))
    println(Arrays.toString(colSum))
    println(Arrays.toString(diagsSum))
    println(avgs)


    return -1
}

fun main(args: Array<String>) {
    println(formingMagicSquare(arrayOf(arrayOf(4, 9, 2), arrayOf(3, 5, 7), arrayOf(8, 1, 5))))
}

//TODO: Keep track of minimum cost