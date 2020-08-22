package com.stepashka.kotlinranks.LinkedLists

fun swapPairs(head: ListNode?): ListNode? {
    if (head?.next ==null) return head
    val grabValue = swapPairs(head.next?.next)
    val newHead = head.next!!
    newHead.next = head
    newHead.next!!.next = grabValue
    return newHead
}