package TwentyTwenty.April.HackerRank.Easy

import java.util.*

//04-06-2020
//https://www.hackerrank.com/challenges/staircase
//Score: 10/10
fun staircase(n: Int): Unit {
    val staircaseArr: Array<Array<Char>> = Array<Array<Char>>(n){ Array<Char>(n) { ' ' } }
    for(i in 0..n-1){
        var stepElem = 0
        for (j in n-1 downTo 0){
            if (stepElem < i + 1) {
                staircaseArr[i][j] = '#'
                stepElem++
            }
        }
        println((staircaseArr[i]).joinToString(""))
    }
}

//input: 6
/*
*    #
    ##
   ###
  ####
 #####
######
*/
fun main(){
    staircase(6)
}