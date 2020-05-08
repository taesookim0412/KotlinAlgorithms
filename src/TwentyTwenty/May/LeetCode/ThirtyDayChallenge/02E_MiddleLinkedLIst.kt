package TwentyTwenty.May.LeetCode.ThirtyDayChallenge

//876. Middle of the Linked List
//05-07-2020
//Runtime: 136 ms, faster than 63.50% of Kotlin online submissions for Middle of the Linked List.
//Memory Usage: 31.9 MB, less than 100.00% of Kotlin online submissions for Middle of the Linked List.
//https://leetcode.com/problems/middle-of-the-linked-list/submissions/

class ListNode(var `val`: Int){
    var next: ListNode? = null
}

fun middleNode(head: ListNode?): ListNode? {
    var head = head
    var listSize = getListSize(head) / 2
    for (i in 0..listSize - 1) {
        head = head?.next
    }
    return head
}

fun getListSize(head: ListNode?): Int {
    var head = head
    var ct = 1
    while (head?.next != null) {
        head = head.next
        ct++
    }
    return ct
}

fun main(){
    println(middleNode(ListNode(4))?.`val`)
}