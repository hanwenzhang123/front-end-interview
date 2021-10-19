/*
Question: Write a function that takes a string as input and returns the string reversed.
Question link: https://leetcode.com/problems/reverse-string/description/
*/

class Solution {
    public String solution(String S) {
        /*Algorithm: 
            Utilize StringBuilder .reverse() & .toString methods
        */
        
        //Create a copy of the string that is reversed
        String SCopy = new StringBuilder(S).reverse().toString();
        //Return the copy
        return SCopy;
    }
}
