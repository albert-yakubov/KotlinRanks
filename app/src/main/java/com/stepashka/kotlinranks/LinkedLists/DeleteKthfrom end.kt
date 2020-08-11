package com.stepashka.kotlinranks.LinkedLists

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class ListNode {
    val value: Int? = null
    var next: ListNode? = null
    }
fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var ll = head
    var last = 1
    var currentNode = ll
    var previousNode = ll
    while (ll != null){
        ll = ll.next
        if (ll == null){
            break
        }

        if(last == n){
            previousNode = currentNode
            currentNode = currentNode!!.next

        }else{
            last++
        }
    }
    if (currentNode==head){
        return currentNode!!.next

    }
    previousNode!!.next = currentNode?.next
    return head
}
fun main(args: Array<String>){
    var listNode1 = ListNode()
    listNode1.value == 2
    println(listNode1)
   println(removeNthFromEnd(ListNode(), 5))

}