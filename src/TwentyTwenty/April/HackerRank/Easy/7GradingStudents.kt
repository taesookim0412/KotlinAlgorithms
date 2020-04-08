package TwentyTwenty.April.HackerRank.Easy

import java.util.*

//04-08-2020
//Grade: 10/10
//https://www.hackerrank.com/challenges/grading/problem
fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    for (i in 0..grades.size-1){
        if (grades[i] <= 35) continue
        val nextMultFive = getNextMultipleOfFive(grades[i])
        if (nextMultFive - grades[i] < 3){
            grades[i] = nextMultFive
        }
    }
    return grades
}

fun getNextMultipleOfFive(grade:Int): Int{
    for (i in 0..5){
        if ((grade + i).rem(5) == 0){
            return grade+i
        }
    }
    //Shouldn't be possible
    return 0
}

/*Output: 75
67
40
33*/
fun main(args: Array<String>) {
    println(Arrays.toString(gradingStudents(arrayOf(73,67,38,33))))
}