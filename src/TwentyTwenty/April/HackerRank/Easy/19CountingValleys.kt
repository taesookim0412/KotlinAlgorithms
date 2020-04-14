package TwentyTwenty.April.HackerRank.Easy


//04-14-2020
//15/15
//Recursive traversal
// Early early early
//Woke up at 2AM
//https://www.hackerrank.com/challenges/counting-valleys/problem
//traverseHike: Huge stack size quick implementation
//traverseHike2: Recursive while loop, more efficient implementation
//TODO: How do I process a string with a million characters?

var classS = ""

fun countingValleys(n: Int, s: String): Int {
    classS = s
    return traverseHike2()

}

fun traverseHike(s:String,
                 sIdx: Int = 0,
                 valleyCt:Int = 0,
height:Int = 0,
pathOfAscent: Boolean = false): Int{
    var newValleyCt = valleyCt
    if (height == 0 && pathOfAscent) newValleyCt++
    /*println(height)*/
    if (sIdx == s.length) return newValleyCt

    var heightOffset = 0
    if (s[sIdx] == 'D') heightOffset--
    else if (s[sIdx] == 'U') heightOffset++
    var newPath:Boolean =
        when (heightOffset){
            1 -> true
            -1 -> false
            else -> false
        }

    return traverseHike(s, sIdx+1, newValleyCt, height+ heightOffset, newPath)
}

//The previous method can accumulate a huge stack size let's try to create an optimal solution while we're here
fun traverseHike2(
                 sIdx: Int = 0,
                 valleyCt:Int = 0): Int{
    if (sIdx == classS.length) return valleyCt
    var newHeight = 0
    var newStrIdx = sIdx


    var lastElementWasCriticalValue = false
    do{
        lastElementWasCriticalValue = newHeight == -1


        newHeight += convertCharIntoNewHeight(classS, newStrIdx)


        newStrIdx++
    }while (newHeight != 0 && newStrIdx != classS.length)
    var newValleyCt = valleyCt
    if (lastElementWasCriticalValue) newValleyCt++
    return traverseHike2(newStrIdx, newValleyCt)
}

private fun convertCharIntoNewHeight(s: String, sIdx: Int): Int {
    return when (s[sIdx]) {
        'U' -> 1
        'D' -> -1
        else -> 0
    }
}

fun main(args: Array<String>) {
    //Interesting null terminator
    val testStr = "Test"
    val newTestStr = testStr.substring(4)
    println(newTestStr)




    //Case where the index out of bound returns a height of 0
    println(countingValleys(8, "UDDDUDUU"))
    println(countingValleys(12, "DDUUDDUDUUUD"))
    println(countingValleys(10, "DUDDDUUDUU"))

}