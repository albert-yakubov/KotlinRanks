package com.stepashka.kotlinranks.LinkedLists


/* Link list node */
class Node(var data: Int) {
    var next: Node? = null

}

internal class MergeLists {
    var head: Node? = null

    /* Method to insert a node at
   the end of the linked list */
    fun addToTheLast(node: Node?) {
        if (head == null) {
            head = node
        } else {
            var temp = head
            while (temp!!.next != null) temp = temp.next
            temp.next = node
        }
    }

    /* Method to print linked list */
    fun printList() {
        var temp = head
        while (temp != null) {
            print(temp.data.toString() + " ")
            temp = temp.next
        }
        println()
    }

    companion object {
        // Driver Code
        @JvmStatic
        fun main(args: Array<String>) {
            /* Let us create two sorted linked
       lists to test the methods
       Created lists:
           llist1: 5->10->15,
           llist2: 2->3->20
    */
            val llist1 = MergeLists()
            val llist2 = MergeLists()

            // Node head1 = new Node(5);
            llist1.addToTheLast(Node(5))
            llist1.addToTheLast(Node(10))
            llist1.addToTheLast(Node(15))

            // Node head2 = new Node(2);
            llist2.addToTheLast(Node(2))
            llist2.addToTheLast(Node(3))
            llist2.addToTheLast(Node(20))
            llist1.head = Gfg().sortedMerge(
                llist1.head,
                llist2.head
            )
            llist1.printList()
        }
    }
}

internal class Gfg {
    /* Takes two lists sorted in
increasing order, and splices
their nodes together to make
one big sorted list which is
returned. */
    fun sortedMerge(headA: Node?, headB: Node?): Node? {

        /* a dummy first node to
       hang the result on */
        var headA = headA
        var headB = headB
        val dummyNode = Node(0)

        /* tail points to the
    last result node */
        var tail: Node? = dummyNode
        while (true) {

            /* if either list runs out,
        use the other list */
            if (headA == null) {
                tail!!.next = headB
                break
            }
            if (headB == null) {
                tail!!.next = headA
                break
            }

            /* Compare the data of the two
        lists whichever lists' data is
        smaller, append it into tail and
        advance the head to the next Node
        */if (headA.data <= headB.data) {
                tail!!.next = headA
                headA = headA.next
            } else {
                tail!!.next = headB
                headB = headB.next
            }

            /* Advance the tail */tail = tail.next
        }
        return dummyNode.next
    }
}


