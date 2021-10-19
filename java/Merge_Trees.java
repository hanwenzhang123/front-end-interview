/*
Question: Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees
are overlapped while the others are not. You need to merge them into a new binary tree. 
The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node.
Otherwise, the NOT null node will be used as the node of new tree.
Question link: https://leetcode.com/problems/merge-two-binary-trees/description/
*/
class Solution {
    public TreeNode solution(TreeNode t1, TreeNode t2) {
        /*Algorithm:
            Go through the tree in preorder
            Check if t1 is null, if it is return t2
            Check if t2 is null, if it is return t1
            If neither t1 or t2 are null, add t2's value to t1
            Recursively check left subtree
            Recursively check right subtree
            Return the root of the updated tree
        */
        //Check if t1 is null, if it is, return t2
        if (t1 == null) {
            return t2;
        }
        //Check if t2 is null, if it is, return t1
        if (t2 == null) {
            return t1;
        }
        
        //Sum node values up as the new value of the merged node
        t1.val += t2.val;
        //Recursively check the left subtree
        t1.left = solution(t1.left, t2.left); 
        //Recursively check the right subtree
        t1.right = solution(t1.right, t2.right);
        //Return the root of the updated tree
        return t1;
    }
}
