# Coding-Questions [![Codacy Badge](https://api.codacy.com/project/badge/Grade/5d370745c9ed4d26a882dc70e3dd556e)](https://www.codacy.com/app/arkdevelop/Coding-Questions?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=arkdevelop/Coding-Questions&amp;utm_campaign=Badge_Grade)

<h3>Student_Lineup.java</h3>
Question: You are given an array A representing heights of students. All the students are asked to stand in rows.
The students arrive by one, sequentially (as their heights appear in A). For the I-th student, if there is a row
in which all the students are taller than A[i], the student will stand in one of such rows. If there is no such row,
the student will create a new row. Your task is to find the minimum number of rows created.

<h3>Shortest_Distance_House_Store.java</h3>
Question: Given two int arrays containing coordinates of stores and houses, find the shortest distance store from each house.
<br>
Example:
<br>
stores = {1,5,11,17,20}
<br>
houses = {5,12,19}
<br>
Should return {5,11,20}

<h3>Substring_Repetition.java</h3>
Question: Given a string A consisting of n characters and a string B consisting of m characters, write a function that will 
return the number of times A must be stated such that B is a substring of the repeated A. 
If B can never be a substring, return -1.
<br>
Example:
A = ‘abcd’
B = ‘cdabcdab’
<br>
The function should return 3 because after stating A 3 times, getting ‘abcdabcdabcd’, B is now a substring of A.
You can assume that n and m are integers in the range [1, 1000]. 
<br>
Question link: https://www.geeksforgeeks.org/google-interview-experience-set-7-software-engineering-intern/

<h3>License_Key_Formatting.java</h3>
Question: Given a string S consisting of N characters and an integer K. S is composed of alphanumerical characters and/or dashes. 
The dashes split the alphanumerical characters within S into groups (i.e. if there are M dashes, the string is split into M+1 groups).
The dashes in S are possibly misplaced.
We want each group of characters to be of length K (except for possibly the first group, which could be shorter, 
but still must contain at least one character). To satisfy this requirement, we will reinsert the dashes. Additionally, 
all the lower case letters in S must be converted to upper case.
<br>
For example, in the license key "2-4A0r7-4k" there are two dashes which split it into three groups of lengths 1, 5 and 2, 
respectively. If we want each group to be of length 4, then we would have to reinsert the dashes. Thus, for K = 4, 
the correctly formatted string is "24A0-R74K".
<br>
Question link: https://leetcode.com/problems/license-key-formatting/description/
<br>
Issue: Code is not efficient - passes 34/38 test cases

<h3>Jewels_and_Stones.java</h3>
Question: You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
Each character in S is a type of stone you have. You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so 'a' is considered a different type of stone from 'A'.
<br>
Question link: https://leetcode.com/problems/jewels-and-stones/description/

<h3>Binary_Tree_Postorder_Traversal.java</h3>
Question: Given a binary tree, return the postorder traversal of its nodes' values.
<br>
Question link: https://leetcode.com/problems/binary-tree-postorder-traversal/description/

<h3>Merge_Trees.java</h3>
Question: Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees
are overlapped while the others are not. You need to merge them into a new binary tree. 
The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node.
Otherwise, the NOT null node will be used as the node of new tree.
<br>
Question link: https://leetcode.com/problems/merge-two-binary-trees/description/

<h3>Reverse_String.java</h3>
Question: Write a function that takes a string as input and returns the string reversed.
<br>
Question link: https://leetcode.com/problems/reverse-string/description/

<h3>Smallest_Positive_Int.java</h3>
Question: Given an array A of N integers, return the smallest positive integer that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
<br>

<h3>Binary_Gap.py</h3>
Question: Find the largest binary gap (maximal sequence of consecutive zeros) within a positive integer N that is surrounded by ones on both sides.
