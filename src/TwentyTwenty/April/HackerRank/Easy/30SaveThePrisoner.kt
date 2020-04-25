package TwentyTwenty.April.HackerRank.Easy


// the power of math
//https://www.hackerrank.com/challenges/save-the-prisoner/problem

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    // Num prisoners: n
    // Num sweets: m
    // Chair number to start: s

    // 5000 sweets 1000 prisoners: start at 3
    // return Remainder of sweets/prisoners + 3

    // 1000 sweets 5000 prisoners: start at 3
    // return sweets + 3
    if (n > m) return m % n + s - 1
    else if (n == m) return s



    // if candies > prisoners
    /*else if (n < m){
        var nDouble = n.toDouble()
        var mDouble = m.toDouble()
        while (mDouble > nDouble){
            mDouble -= nDouble
        }
        return (mDouble + s - 1).toInt()
    }*/
    val idx = (s - 1 + m ) % n
    return if (idx == 0) n else idx
}


/*tailrec fun recThePrisoner(n: Int, m: Int, s: Int,
                   prisonerIndx:Int): Int {
    if (m==1) return prisonerIndx
    var prisonerIndx = prisonerIndx
        prisonerIndx = if (prisonerIndx + 1 > n) 1 else prisonerIndx + 1
    return recThePrisoner(n, m-1, s, prisonerIndx)
}*/


fun main(args: Array<String>) {
    //{Prisoners, Sweets, Initial}
    //6
    println(saveThePrisoner(7, 19, 2))
    //3
    println(saveThePrisoner(3, 7, 3))
    //2
    println(saveThePrisoner(5, 2, 1))
    //3
    println(saveThePrisoner(5, 2, 2))
    //4
    println(saveThePrisoner(4, 2, 3))
    //356482915
    println(saveThePrisoner(715950220, 876882456, 195550680))
}