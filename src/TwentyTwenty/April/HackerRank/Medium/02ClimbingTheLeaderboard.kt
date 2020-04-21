package TwentyTwenty.April.HackerRank.Medium

import TwentyTwenty.April.HackerRank.Library.Library
import java.util.*

//04-20-2020
//20/20
//https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
//Tail recursion + Library Arrayify Function
// "// So in order to test algorithms we're actually going to create an algorithm
//// in order to use these test cases"




//04-16-2020
//12/20 (4 cases did not complete within time limit)
//https://www.hackerrank.com/challenges/climbing-the-leaderboard/submissions
//poor condition and exams could definitely remove the breaks
//probably possible to do this in place
/*


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
}*/

/*fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    var rankArr = Array<Int>(alice.size){0}
    for (h in 0..alice.size-1){
        var previousScore = scores[0]
        var currentRank = 1
        for (i in 0..scores.size-1){
            if (scores[i] != previousScore) {
                previousScore = scores[i]
                currentRank++
            }
            if (alice[h] > scores[i] || alice[h] == scores[i]) {
                rankArr[h] = currentRank
                break
            }
            //Last
            if (i == scores.size-1){
                rankArr[h] = currentRank + 1
            }
        }
    }
    return rankArr
}*/

fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {

    var rankArray = Array<Int>(scores.size){0}
    var currentRank = 1
    var lastScore = scores[0]
    for (i in 0..scores.size-1){
        if (scores[i] != lastScore) currentRank++
        lastScore = scores[i]
        rankArray[i] = currentRank
    }

    return climbingTheLeaderboards(scores, alice, rankArray, scores.size-1, 0)
}

tailrec fun climbingTheLeaderboards(scores: Array<Int>, alice: Array<Int>, rankArray: Array<Int>, scoresIdx: Int, rankIdx: Int): Array<Int>{
    if(rankIdx == alice.size) return alice
    if (scoresIdx == -1) {
        for (i in rankIdx..alice.size-1){
            alice[i] = 1
        }
        return alice
    }
    var scoresIdx = scoresIdx
    var rankIdx = rankIdx
    if (scores[scoresIdx] > alice[rankIdx]){
        alice[rankIdx] = rankArray[scoresIdx] + 1
        rankIdx++
        scoresIdx++
    }
    else if (scoresIdx == 0) alice[rankIdx] = 1
    return climbingTheLeaderboards(scores, alice, rankArray, scoresIdx - 1, rankIdx)
}


fun main(args: Array<String>) {
    println(Arrays.toString(climbingLeaderboard(arrayOf(100, 90, 90, 80, 75, 60), arrayOf(50, 65, 77, 90, 102))))
    println(Arrays.toString(climbingLeaderboard(arrayOf(100, 100, 50, 40, 40, 20, 10), arrayOf(5, 25, 50, 120))))
    var arr1 = Library.arrayify("295 294 291 287 287 285 285 284 283 279 277 274 274 271 270 268 268 268 264 260 259 258 257 255 252 250 244 241 240 237 236 236 231 227 227 227 226 225 224 223 216 212 200 197 196 194 193 189 188 187 183 182 178 177 173 171 169 165 143 140 137 135 133 130 130 130 128 127 122 120 116 114 113 109 106 103 99 92 85 81 69 68 63 63 63 61 57 51 47 46 38 30 28 25 22 15 14 12 6 4")
    var arr2 = Library.arrayify("5 5 6 14 19 20 23 25 29 29 30 30 32 37 38 38 38 41 41 44 45 45 47 59 59 62 63 65 67 69 70 72 72 76 79 82 83 90 91 92 93 98 98 100 100 102 103 105 106 107 109 112 115 118 118 121 122 122 123 125 125 125 127 128 131 131 133 134 139 140 141 143 144 144 144 144 147 150 152 155 156 160 164 164 165 165 166 168 169 170 171 172 173 174 174 180 184 187 187 188 194 197 197 197 198 201 202 202 207 208 211 212 212 214 217 219 219 220 220 223 225 227 228 229 229 233 235 235 236 242 242 245 246 252 253 253 257 257 260 261 266 266 268 269 271 271 275 276 281 282 283 284 285 287 289 289 295 296 298 300 300 301 304 306 308 309 310 316 318 318 324 326 329 329 329 330 330 332 337 337 341 341 349 351 351 354 356 357 366 369 377 379 380 382 391 391 394 396 396 400")
    println(Arrays.toString(climbingLeaderboard(arr1, arr2)))
    var arr3 = Library.arrayify("997 981 957 933 930 927 926 920 916 896 887 874 863 863 858 847 815 809 803 794 789 785 783 778 764 755 751 740 737 730 691 677 652 650 587 585 583 568 546 541 540 538 531 527 506 493 457 435 430 427 422 422 414 404 400 394 387 384 374 371 369 369 368 365 363 337 336 328 325 316 314 306 282 277 230 227 212 199 179 173 171 168 136 125 124 95 92 88 85 70 68 61 60 59 44 43 28 23 13 12")
    var arr4 = Library.arrayify("12 20 30 32 35 37 63 72 83 85 96 98 98 118 122 125 129 132 140 144 150 164 184 191 194 198 200 220 228 229 229 236 238 246 259 271 276 281 283 287 300 302 306 307 312 318 321 325 341 341 341 344 349 351 354 356 366 369 370 379 380 380 396 405 408 417 423 429 433 435 438 441 442 444 445 445 452 453 465 466 467 468 469 471 475 482 489 491 492 493 498 500 501 504 506 508 523 529 530 539 543 551 552 556 568 569 571 587 591 601 602 606 607 612 614 619 620 623 625 625 627 638 645 653 661 662 669 670 676 684 689 690 709 709 710 716 724 726 730 731 733 737 744 744 747 757 764 765 765 772 773 774 777 787 794 796 797 802 805 811 814 819 819 829 830 841 842 847 857 857 859 860 866 872 879 882 895 900 900 903 905 915 918 918 922 925 927 928 929 931 934 937 955 960 966 974 982 988 996 996")
    println(Arrays.toString(climbingLeaderboard(arr3, arr4)))

}