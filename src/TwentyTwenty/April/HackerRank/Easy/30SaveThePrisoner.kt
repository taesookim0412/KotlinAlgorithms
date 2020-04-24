package TwentyTwenty.April.HackerRank.Easy


//04-23-2020
//timeout
//test cases work
//https://www.hackerrank.com/challenges/save-the-prisoner/problem

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    return recThePrisoner(n, m, s, s)
}

tailrec fun recThePrisoner(n: Int, m: Int, s: Int,
                   prisonerIndx:Int): Int {
    if (m==1) return prisonerIndx
    var prisonerIndx = prisonerIndx
        prisonerIndx = if (prisonerIndx + 1 > n) 1 else prisonerIndx + 1
    return recThePrisoner(n, m-1, s, prisonerIndx)
}


fun main(args: Array<String>) {
    //{Prisoners, Sweets, Initial}
    println(saveThePrisoner(7, 19, 2))
    println(saveThePrisoner(3, 7, 3))
    //356482915
    println(saveThePrisoner(715950220, 876882456, 195550680))
}