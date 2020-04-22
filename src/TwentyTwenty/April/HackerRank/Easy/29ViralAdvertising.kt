package TwentyTwenty.April.HackerRank.Easy

//04-22-2020
//15/15
//https://www.hackerrank.com/challenges/strange-advertising

fun viralAdvertising(n: Int): Int {
    var likes = 2
    var recipients = 6
    for (i in 2..n){
        var likingRecipients = Math.floor(recipients/2.0).toInt()
        likes += likingRecipients
        recipients = likingRecipients * 3
    }
    return likes
}

fun main(args: Array<String>) {
    println(viralAdvertising(1))
    println(viralAdvertising(2))
    println(viralAdvertising(3))
    println(viralAdvertising(4))
}