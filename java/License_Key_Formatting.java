/* 
Question: Given a string S consisting of N characters and an integer K. S is composed of alphanumerical characters and/or dashes. 
The dashes split the alphanumerical characters within S into groups (i.e. if there are M dashes, the string is split into M+1 groups).
The dashes in S are possibly misplaced.
We want each group of characters to be of length K (except for possibly the first group, which could be shorter, 
but still must contain at least one character). To satisfy this requirement, we will reinsert the dashes. Additionally, 
all the lower case letters in S must be converted to upper case.

For example, in the license key "2-4A0r7-4k" there are two dashes which split it into three groups of lengths 1, 5 and 2, 
respectively. If we want each group to be of length 4, then we would have to reinsert the dashes. Thus, for K = 4, 
the correctly formatted string is "24A0-R74K".
Question link: https://leetcode.com/problems/license-key-formatting/description/
*/
class Solution {
    public String solution(String S, int K) {
        /*Algorithm: 
            Create a counter for iterating through the string to know when to append a '-'
            Iterate through a reversed copy of the string to deal with appending '-' at the beginning
            for groupings less than K
            Reverse the returned string to get the correct result
            Uppercase the string and return it
        */

        //Create a reversed copy of the string S
        String SCopy = new StringBuilder(S).reverse().toString();

        //Create a new string for storing result
        String toReturn = new String();
        //Create a counter for the number of hyphens
        int counter = 0;
        //Go through the length of the string appending
        int length = SCopy.length();
        for (int i = 0; i < length; i++) {
            //If counter == K, append a -
            if (counter == K) {
                toReturn = toReturn + "-";
                counter = 0;
            }
            //If character at i isn't -, append it
            if (SCopy.charAt(i) != '-') {
                //Place into new string
                toReturn = toReturn + SCopy.charAt(i);
                counter++;
            }
        }

        //Reverse the returned copy
        String toReturnCopy = new StringBuilder(toReturn).reverse().toString().toUpperCase();
        if (toReturnCopy.charAt(0) == '-') {
            toReturnCopy = toReturnCopy.substring(1);
        }
        
        //Return the result
        return toReturnCopy;
    }
}
