package com.stepashka.kotlinranks.LinkedLists

import kotlin.collections.HashSet


/* Inserts a new Node at front of the list. */
    fun push(new_data: Int) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        val new_node = Node(new_data)
        var ll = Node(new_data)
        /* 3. Make next of new Node as head */new_node.next = ll

        /* 4. Move the head to point to new Node */ll = new_node
    }

    // Returns true if there is a loop in linked
    // list else returns false.
    fun detectLoop(h: ListNode): Boolean {
        var h = h
        val s = HashSet<ListNode>()
        while (h != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h)) return true

            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h)
            h = h.next!!
        }
        return false
    }


    /* Linked list Node*/


fun main(args: Array<String>) {
    val llist = ListNode()
    push(20)
    push(4)
    push(15)
    push(10)

    /*Create loop for testing */llist!!.next!!.next!!.next!!.next = llist
    if (detectLoop(llist)) println("Loop found") else println("No Loop")
}