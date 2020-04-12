package TwentyTwenty.April.HackerRank.Easy

//04-12-2020
//Feb is the only variable month
//Calculate leap years
//15/15
//18 min
//https://www.hackerrank.com/challenges/day-of-the-programmer
//48min resetting
fun dayOfProgrammer(year: Int): String {
    //Jan = ar[0], feb = ar[1]
    var daysArr = arrayOf(31,28,31,30,31,30,31,31)
    //Calculate ar[1]
    //Julian calendar
    var daysSum = 0

    if (year < 1918) {
        daysArr[1] = findFebDaysJulian(year)
    }
    else if (year >= 1919){
        daysArr[1] = findFebDaysGregorian(year)
    }
    //if its 1918 then they lost 13 days
    else if (year == 1918) {
        daysSum = -13
    }

    for (i in 0..daysArr.size-1){
        daysSum += daysArr[i]
    }
    val dayOfMonth = 256 - daysSum
    return StringBuilder().append(dayOfMonth)
        .append(".09.")
        .append(year).toString()


}

fun findFebDaysGregorian(year: Int): Int {
    //is leap year?
    if (year % 4 == 0 && year % 100 != 0){
        return 29
    }
    if (year % 400 == 0){
        return 29
    }
    return 28
}

fun findFebDaysJulian(year: Int): Int {
    //is leap year?
    if (year % 4 == 0) {
        return 29
    }
    return 28
}

fun main(args: Array<String>) {
    println(dayOfProgrammer(1800))
}