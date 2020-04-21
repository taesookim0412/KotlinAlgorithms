package TwentyTwenty.April.HackerRank.Easy


//20/20
//04-21-2020
//https://www.hackerrank.com/challenges/angry-professor/
//Goal = reached

fun angryProfessor(k: Int, a: Array<Int>): String {
var numStudents = 0
    for (i in 0..a.size-1){
        if (a[i] <= 0) numStudents++
    }
    return if (numStudents >= k) "NO" else "YES"
}

fun main(args: Array<String>) {

}