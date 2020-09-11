package com.stepashka.kotlinranks.TreeLesson

import java.util.*
import kotlin.collections.ArrayList


fun inorderTraversal(root: TreeNode?): List<Int> {
    val answerList = ArrayList<Int>()
    if(root == null) return answerList.toList()
    val stack = Stack<TreeNode?>()
    var currentNode = root

    while(currentNode != null || stack.size > 0){
        //this is how to reach the most left node:
        while (currentNode != null){
            stack.push(currentNode)
            //reset:
            currentNode = currentNode.left
            answerList.add(currentNode!!.left!!.`val`)
        }
        currentNode = stack.pop()
        currentNode = currentNode!!.right

    }
    return answerList.toList()
}


//fun preorderTraversal(root: TreeNode?): ArrayList<Int> {
//    val returnList = ArrayList<Int>()
//    if (root == null) return returnList
//    val stack = Stack<TreeNode?>()
//    stack.push(root)
//    while (!stack.empty()) {
//        val n = stack.pop()
//        returnList.add(n!!.`val`)
//        if (n.right != null) {
//            stack.push(n.right)
//        }
//        if (n.left != null) {
//            stack.push(n.left)
//        }
//    }
//    return returnList
//}