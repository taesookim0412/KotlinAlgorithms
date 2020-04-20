package TwentyTwenty.April.HackerRank.Easy

//04-20-2020
//20/20
//https://www.hackerrank.com/challenges/picking-numbers/problem
fun pickingNumbers(a: Array<Int>): Int {
    a.sort()
    var numsList1 = mutableListOf<Int>()
    var numsList2 = mutableListOf<Int>()

    var currentList = numsList1
    for (i in 0..a.size-1){

        if (currentList.size >= 1 && Math.abs(currentList[0] - a[i]) > 1){
            if (currentList == numsList2) {
                //numsList1 will hold our largest list
                if (currentList.size > numsList1.size){
                    numsList1 = currentList.toMutableList()
                }
                currentList.clear()
            }
            currentList = numsList2
        }
        currentList.add(a[i])
    }
    if (numsList1.size > numsList2.size) return numsList1.size
    return numsList2.size

}

fun main(args: Array<String>) {
    println(pickingNumbers(arrayOf(1, 2, 2, 3, 1, 2)))
    println(pickingNumbers(arrayOf(1, 1, 2, 2, 4, 4, 5, 5, 5)))
    println(pickingNumbers(arrayOf(4, 6, 5, 3, 3, 1)))
    println(pickingNumbers(arrayOf(98, 3, 99, 1, 97, 2)))
}