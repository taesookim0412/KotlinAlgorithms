package TwentyTwenty.April.HackerRank.Easy


//4-8-2020
//https://www.hackerrank.com/challenges/time-conversion/problem
//15/15
//many library functions
//2 edge cases
//good if statement practice (
// != && !=
// !=
// (!= && !=)

fun timeConversion(s: String): String {
    val sLen = s.length
    val secondLastChar = s[sLen-2]

    var cStr = s.toCharArray()
    cStr[sLen-1] = ' '
    cStr[sLen-2] = ' '
    cStr.dropLast(2)


    val hrStr = arrayOf(cStr[0], cStr[1]).joinToString("")
    if (secondLastChar == 'A'){
        //edgecase: 12pm, 12am if Midnight (12am -> 00)
        if (hrStr == "12") {
            cStr[0] = '0'
            cStr[1] = '0'
        }

    }
    else if (secondLastChar == 'P'){
        // if night add 12
        //edgecase: 12pm is not 24pm

        if (hrStr != "12"){
            var hr: Int = hrStr.toInt()
            hr += 12
            val hrStr: String = hr.toString()
            cStr[0] = hrStr[0]
            cStr[1] = hrStr[1]
        }
    }


    return cStr.joinToString("")
}

//output: 07:05:45
//19:05:45
fun main(){
    println(timeConversion("07:05:45AM"))
    println(timeConversion("07:05:45PM"))
}