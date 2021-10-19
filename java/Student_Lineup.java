import java.lang.*;
import java.io.*;
import java.util.*;

/*
Question: You are given an array A representing heights of students. All the students are asked to stand in rows.
The students arrive by one, sequentially (as their heights appear in A). For the I-th student, if there is a row
in which all the students are taller than A[i], the student will stand in one of such rows. If there is no such row,
the student will create a new row. Your task is to find the minimum number of rows created.
 */
class Solution {
    public int solution(int[] A) {
        /*Algorithm:
            Create an arraylist of integer lists
            Go through a loop checking all integers in each individual list
            If the current student is less than all students in list, add him to that list
            else, create a new list and add it to list of nested lists
        */

        //Create new list of lists (Integer) for storing rows of students in
        List<List<Integer>> intNestedList = new ArrayList<>();

        //Go through the length of the number of students
        for (int i = 0; i < A.length; i++) {
            Boolean add = false;
            Boolean createNewList = false;

            //Handle initial student
            if (intNestedList.size() == 0) {
                //Create a new list and add A[i] to it
                List<Integer> newList = new ArrayList<Integer>();
                newList.add(A[i]);
                intNestedList.add(newList);
                //break from loop to go on to next number
                continue;
            }

            //Go through all nested lists checking for a row to place student in
            for (List<Integer> current : intNestedList) {
                //Go through all integers of each nested list to see if student may be placed
                //in that row
                for (Integer currentInt : current) {
                    //Check if the current integer in the list is smaller than the integer
                    //trying to be added
                    if (currentInt.intValue() < A[i]) {
                        //If the current integer being added is smaller than any of the
                        //integers in the list, set flag to true
                        createNewList = true;
                    }
                    else {
                        //Set create new list flag to true
                        add = true;
                    }
                }

                //Add integer to list
                if (add == true) {
                    current.add(A[i]);
                    //break from loop to go on to next number
                    break;
                }
                //Create new list and add student to that row
                else if (createNewList == true) {
                    List<Integer> newList = new ArrayList<Integer>();
                    newList.add(A[i]);
                    intNestedList.add(newList);
                    //break from loop to go on to next number
                    break;
                }
            }
        }

        //Count number of lists to add then add them
        int listCount = intNestedList.size();
        //Return list count
        return listCount;
    }
}
