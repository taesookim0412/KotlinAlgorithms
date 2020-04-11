package TwentyTwenty.April.HackerRank.Easy

//Say your birthday is 04/12
//Then you would return results from 4 squares totaling 12
//04-11-2020
//10/10
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
//Recursion?
//Seems unnecessary stack size you can just n^2 it

    var chocSegments = 0
    for (i in 0..s.size-1){
        //if next elems size can fit the M
        if (s.size >= i + m) {
            var summation = 0
            for (j in 0..m-1) {
                /*println(s[i + j])*/
                summation += s[i + j]
            }
            /*println("Summation: $summation")*/
            if (summation == d) chocSegments++
        }
    }
    return chocSegments

}

fun main(args: Array<String>) {
    //1
    println(birthday(arrayOf(4), 4, 1))
    //2
    println(birthday(arrayOf(1, 2, 1, 3, 2), 3, 2))
    //0
    println(birthday(arrayOf(1, 1, 1, 1, 1), 3, 2))
    //0
    println(birthday(arrayOf(1, 9, 9, 6), 12, 4))

}