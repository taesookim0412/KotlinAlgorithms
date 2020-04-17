package TwentyTwenty.April.HackerRank.Easy

//04-17-2020
//https://www.hackerrank.com/challenges/append-and-delete/
//12.73/20
//Read it wrong, you can only delete the last character in a string
fun appendAndDelete(s: String, t: String, k: Int): String {
    if (s.length >= t.length) return getOperationsCt(s, t, k)
    return getOperationsCt(t, s, k)


}

private fun getOperationsCt(
    s: String,
    t: String,
    k: Int
): String {
    var cMainStr = Array<Char?>(s.length) { null }
    var cStr = Array<Char?>(s.length) { null }
    for (i in 0..t.length - 1) {
        cStr[i] = t[i]
    }
    for (i in 0..s.length - 1) {
        cMainStr[i] = s[i]
    }

    var operationsCt = -1 * (s.length - t.length)
    for (i in 0..s.length - 1) {
        if (s[i] != cStr[i]) {
            operationsCt += 2
        }
    }
    if (k >= operationsCt) return "Yes"
    return "No"
}

fun main(args: Array<String>) {
    println(appendAndDelete("ashley", "ash", 2))
    println(appendAndDelete("happyhacker", "hackerrank", 9))
    println(appendAndDelete("aba", "aba", 7))
    println(appendAndDelete("aaaaaaaaaa", "aaaaa", 7))
    println(appendAndDelete("zzzzz", "zzzzzzz", 7))

}