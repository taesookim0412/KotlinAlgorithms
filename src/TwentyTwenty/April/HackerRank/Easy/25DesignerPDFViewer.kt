package TwentyTwenty.April.HackerRank.Easy

import TwentyTwenty.April.HackerRank.Library.Library

//04-21-2020
//20/20
//Ternary alternative
//https://www.hackerrank.com/challenges/designer-pdf-viewer

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    var highestLetter = 0
    for (i in 0..word.length-1){
        var letterHeight = h[word[i].toInt()-97]
        highestLetter = if(letterHeight > highestLetter) letterHeight else highestLetter
    }
    return highestLetter * word.length
}

fun main(args: Array<String>) {
    println(designerPdfViewer(Library.arrayify("1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7"), "zaba"))
}