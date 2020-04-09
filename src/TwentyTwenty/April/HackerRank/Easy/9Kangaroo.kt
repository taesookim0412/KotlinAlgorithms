package TwentyTwenty.April.HackerRank.Easy


//04-09-2020
//Score: 10/10
//https://www.hackerrank.com/challenges/kangaroo/problem
//x=0 , v=3u/j
//x=4 , v=2u/j

// 4+2x = 0+3x
// 2x = 3x - 4
// -x = -4
// x = 4 jumps
//https://www.hackerrank.com/challenges/kangaroo/problem?h_r=next-challenge&h_v=zen
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    val newVVar:Double = (v1 - v2).toDouble()
    val newOffset:Double = (x2 - x1).toDouble()
    val newJumps = newOffset/newVVar
    /*println(newJumps)*/
    if (newJumps/Math.round(newJumps) == 1.00 && newJumps > 0)
        return "YES"
    return "NO"
}

//input: (x, x_1) = (0, 5); (v, v_2) = (2, 3)
//output: NO
fun main(args: Array<String>) {

    //Yes (4 jumps)
    println(kangaroo(0, 3, 4, 2))

    //No
    //x1 + v1x = x_2 + v_2x
    //v1x - v2x
    // x2 - x1
    // offset - var

    //0 + 2x = 5 + 3x
    // -x = 5
    // x = -5
    println(kangaroo(0, 2, 5, 3))
}