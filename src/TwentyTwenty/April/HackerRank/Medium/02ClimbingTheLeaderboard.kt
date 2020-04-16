package TwentyTwenty.April.HackerRank.Medium

import java.util.*

//04-16-2020
//12/20 (4 cases did not complete within time limit)
//https://www.hackerrank.com/challenges/climbing-the-leaderboard/submissions
//poor condition and exams could definitely remove the breaks
//probably possible to do this in place

fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    var rankArray = Array<Int>(scores.size) {0}
    //create rankarr
    var previousScore = scores[0]
    var previousRank = 1
    for (i in 0..scores.size-1){
        if (scores[i] != previousScore) previousRank++
        rankArray[i] = previousRank
        previousScore = scores[i]
    }

    var resultsArray = Array<Int>(alice.size){0}
    for (i in 0..alice.size-1){
        previousRank = rankArray[0]
        for (j in 0..scores.size-1){
            //EC
            if (scores[j] < alice[i] && j == 0){
                resultsArray[i] = 1
                break
            }


            //Same score
            if (scores[j] == alice[i]){
                resultsArray[i] = rankArray[j]
                break
            }
            //EC
            else if (scores[j] > alice[i] && j == scores.size-1){
                resultsArray[i] = rankArray[j] + 1
                break
            }
            else if (scores[j] < alice[i]){
                resultsArray[i] = previousRank + 1
                break
            }
            else if (scores[j] > alice[i]){
                previousRank = rankArray[j]
            }

        }
    }
    return resultsArray
}

fun main(args: Array<String>) {
    println(Arrays.toString(climbingLeaderboard(arrayOf(100, 90, 90, 80, 75, 60), arrayOf(50, 65, 77, 90, 102))))
}