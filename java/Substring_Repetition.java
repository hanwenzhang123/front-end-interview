/*
Question: Given a string A consisting of n characters and a string B consisting of m characters, write a function that will 
return the number of times A must be stated such that B is a substring of the repeated A. 
If B can never be a substring, return -1.
Example:
A = ‘abcd’
B = ‘cdabcdab’
The function should return 3 because after stating A 3 times, getting ‘abcdabcdabcd’, B is now a substring of A.
You can assume that n and m are integers in the range [1, 1000]. 
Question link: https://www.geeksforgeeks.org/google-interview-experience-set-7-software-engineering-intern/
*/

class Solution {
    public int solution(String A, String B) {
        /*Algorithm: 
            Search for A in B
            if A does not exist in B, return -1
            else
            counter = 1 //for original substring
            check length of characters to left and length of characters to right of substring A in B
            if leftCharacters > length(A)
            counter = leftCharacters / length(A)
            else if leftCharacters < length(A) && leftCharacters != 0
            counter++
            if rightCharacters > length(A)
            counter = rightCharacters / length(A)
            else if rightCharacters < length(A) && rightCharacters != 0
            counter++
            return counter
        */
        
        //Search for subString A in B
        int end = B.indexOf(A);
        int ALength = A.length();

        //If subString not found, return -1
        if (end == -1) {
            return -1;
        }
        
        //Counter for original substring
        int counter = 1;

        //If found, count characters to left of subString start
        String leftString = B.substring(0, end);
        int foundLeftCharacters = leftString.length();

        //If found, count characters to right of subString start
        String rightString = B.substring(end, B.length());
        int foundRightCharacters = rightString.length();

        //If foundLeftCharacters < strlen(subString) && foundLeftCharacters != 0 | Counter++
        if (foundLeftCharacters < ALength && foundLeftCharacters != 0) {
            counter++;
        }
        //If foundRightCharacters < strlen(subString) && foundRightCharacters != 0 | Counter++
        if (foundRightCharacters < ALength && foundRightCharacters != 0) {
            counter++;
        }
        //If foundLeftCharacters > strlen(subString)
        if (foundLeftCharacters > ALength) {
            //toAddToCounter = foundLeftCharacters / strlen(subString)
            int toAdd = foundLeftCharacters / ALength;
            counter = counter + toAdd;
        }
        //if foundRightCharacters > strlen(subString)
        if (foundRightCharacters > ALength) {
            //toAddToCounter = foundRightCharacters / strlen(subString)
            int toAdd = foundRightCharacters / ALength;
            counter = counter + toAdd;
        }

        return counter;
    }
}
