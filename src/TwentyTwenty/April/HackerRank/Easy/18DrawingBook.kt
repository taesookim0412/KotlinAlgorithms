package TwentyTwenty.April.HackerRank.Easy


//04-14-2020
//10/10
//https://www.hackerrank.com/challenges/drawing-book/problem
//"The last page may only be printed on the front, given the length of the book"
//However that's wrong
//?????????

fun pageCount(n: Int, p: Int): Int {
    var pageFlips1 = 0
    var pageToRight = 1
    for (i in 1 until p step 2){
        pageFlips1++
        pageToRight+=2
    }
    var pageFlips2 = 0
    var pageToLeft = p
    var pageToLeftDoublePaged = p
    var doublePaged = false
    // if last page is to the left
    if (n % 2 == 0) {
        for (i in n downTo p+1 step 2){
            pageFlips2++
        }
    }
    //else if last page is to the right (double paged scenario)
    else{
        for (i in n-1 downTo p+1 step 2){
            pageFlips2++
        }
    }
/*    println("PF1: $pageFlips1")
    println("PF2: $pageFlips2")*/

    if (pageFlips1 > pageFlips2) return pageFlips2
    return pageFlips1
}

fun main(args: Array<String>) {
    //0
    println(pageCount(5, 1))
    //0
    println(pageCount(5, 4))
    //1
    println(pageCount(6, 2))
}