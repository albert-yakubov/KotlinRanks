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
        while (currentNode != null) {
            stack.push(currentNode)
            answerList.add(currentNode.`val`)
            //reset:
            if (currentNode.left != null) {
                currentNode = currentNode.left


            }
            if (currentNode?.right != null) {
                currentNode = stack.pop()
                currentNode = currentNode!!.right
            }
        }
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
fun calculateSeconds(years: Double): Float {

    val day = 1
    var hours = day *24
    var ageInHours = 356 * 24
    var minutes = ageInHours * 60
    var seconds = minutes * 60
    return minutes.toFloat()
}
fun main(args: Array<String>){
    println(calculateSeconds(33.0))
}
