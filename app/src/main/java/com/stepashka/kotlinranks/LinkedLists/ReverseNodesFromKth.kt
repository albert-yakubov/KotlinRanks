package com.stepashka.kotlinranks.LinkedLists

import java.util.*

fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
    var tempHead: ListNode? = head ?: return null

    var targetNumber = k
    var first = head
    var last = head

    // another form of base case:
    while(--targetNumber > 0 && last != null){
         last = last.next
    }

    if (last != null){
        var newHead = last.next
        val stack = Stack<ListNode>()
        while (first != last){
            stack.push(first)
            first = first!!.next
        }
        while (!stack.empty()){
            last!!.next = stack.pop()
            last = last!!.next
        }
        last!!.next = reverseKGroup(newHead, k)
    }


    return first

}

fun main(args: Array<String>){
    var node1 = ListNode()
    node1.value == 1

    var node2 = ListNode()
    var node3 = ListNode()
    var nodes: Array<ListNode>? = null
    nodes = arrayOf(node1, node2, node3)
    node1.value == 2
    println(node1.value)
    println(reverseKGroup(node1, 3).toString())
}