package com.stepashka.kotlinranks.TreeLesson

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 Definition for a binary tree node.*/
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}


fun preorderTraversal(root: TreeNode?): List<Int> {
    var k: Int
    if (root !== null) {
            pre.get(k++) = { root -> `val` }
            preorder { root -> l }
            preorder { root -> r }
        }
    }
}
void preorder(node *root){
    if(root!=NULL){
        pre[k++]=root->val;
        preorder(root->l);
        preorder(root->r);
    }
}
