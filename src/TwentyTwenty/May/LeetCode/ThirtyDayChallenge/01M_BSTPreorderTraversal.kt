package TwentyTwenty.May.LeetCode.ThirtyDayChallenge

//1008. Construct Binary Search Tree from Preorder Traversal
//05-07-2020
//Runtime: 156 ms, faster than 88.16% of Kotlin online submissions for Construct Binary Search Tree from Preorder Traversal.
//Memory Usage: 33.8 MB, less than 100.00% of Kotlin online submissions for Construct Binary Search Tree from Preorder Traversal.
//https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/submissions/



/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class TreeNode(var `val`: Int){
    var left: TreeNode? = null
    var right: TreeNode? = null
}

    fun bstFromPreorder(preorder: IntArray): TreeNode? {
    var newTree = TreeNode(preorder[0])
        var treeInst = newTree
        for (i in 1..preorder.size-1) {
            traverse(preorder[i], i, treeInst)
            treeInst = newTree
        }
        return newTree
    }

    private fun traverse(
        num: Int,
        i: Int,
        treeInst: TreeNode
    ) {
        if (treeInst.left == null && num < treeInst.`val`) {
            treeInst.left = TreeNode(num)
            return
        }
        if (treeInst.right == null && num > treeInst.`val`) {
            treeInst.right = TreeNode(num)
            return
        }
        if (num <= treeInst.`val`) {
            traverse(num, i, treeInst.left!!)
            return
        }
        if (num > treeInst.`val`) {
            traverse(num, i, treeInst.right!!)
            return
        }
    }
fun main(){
    bstFromPreorder(intArrayOf(8, 5, 1, 7, 10, 12))
}
