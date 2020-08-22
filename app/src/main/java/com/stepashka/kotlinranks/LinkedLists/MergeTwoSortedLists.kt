package com.stepashka.kotlinranks.LinkedLists

import java.util.ArrayList


fun mergeKLists(lists: Array<ListNode>?): ListNode? {
    var node = ListNode()
    var answers = node
    var tempList = ArrayList<ListNode>()
    lists!!.forEach { listNode -> listNode?.let { tempList.add(listNode) } }
    while (tempList.size > 0){
        tempList.sortBy { it.value }
        var firstVal = tempList.first()
        answers.next = firstVal
        answers = firstVal
        if (firstVal.next == null){
            tempList.removeAt(0)
        }else{
            tempList[0] = firstVal.next!!
        }
    }
    return node.next
}
//with linked list there is a head node and the pointer to the next
fun main(args: Array<String>){
    var node1 = ListNode()
    var node2 = ListNode()
    var node3 = ListNode()
    var nodes: Array<ListNode>? = null
    nodes = arrayOf(node1, node2, node3)
    node1.value == 2
    println(node1.value)
    println(mergeKLists(nodes))
}