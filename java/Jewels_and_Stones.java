/*
Question: You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
Each character in S is a type of stone you have. You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so 'a' is considered a different type of stone from 'A'.
Question link: https://leetcode.com/problems/jewels-and-stones/description/
*/
class Solution {
    public int solution(String J, String S) {
        /*Algorithm: 
            Convert J to character array for easier searching
            Go through each character of S checking if it's a character of J array
            If character of S is character of J array, count++
            return count
        */
        
        //Convert J to a character array for searching
        char[] chars = J.toCharArray();
        
        int count = 0;
        int SLength = S.length();
        //Go through each jewel
        for (char current : chars) {
            //Check if the jewel is a part of the stone representation
            for (int i = 0; i < SLength; i++) {
                //If found a jewel, increment the count
                if (current == S.charAt(i)) {
                    count++;
                }
            }
        }
        //Return the count of jewels found
        return count;
    }
}
