package com.stepashka.kotlinranks.TreeLesson

import java.util.*

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 Definition for a binary tree node.*/
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun preorderTraversal(root: TreeNode?): ArrayList<Int> {
    val returnList = ArrayList<Int>()
    if (root == null) return returnList
    val stack = Stack<TreeNode?>()
    stack.push(root)
    while (!stack.empty()) {
        val n = stack.pop()
        returnList.add(n!!.`val`)
        if (n.right != null) {
            stack.push(n.right)
        }
        if (n.left != null) {
            stack.push(n.left)
        }
    }
    return returnList
}
