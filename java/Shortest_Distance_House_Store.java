import java.lang.*;
import java.io.*;
import java.util.*;

/*
Question: Given two int arrays containing coordinates of stores and houses, find the shortest distance store from each house.
Example: 
stores = {1,5,11,17,20}
houses = {5,12,19}
Should return {5,11,20}
*/
public class Solution {
    public static int[] solution(int[] stores, int[] houses) {

        /*Algorithm:
            Iterate through the houses to find the shortest distance store
            Iterate through stores, keeping the shortest one
         */
        ArrayList<Integer> toStore = new ArrayList<Integer>();

        int storesLength = stores.length;
        int housesLength = houses.length;

        for (int i = 0; i < housesLength; i++) {
            int currentHouse = houses[i];
            int shortestDistance = 999999;
            int toAdd = 0;
            for (int j = 0; j < storesLength; j++) {
                int currentStore = stores[j];
                int calculation = currentHouse - currentStore;
                int calculation2 = currentStore - currentHouse;
                int minimum = Math.min(calculation, calculation2);
                minimum = minimum * -1;
                if (minimum >= 0) {
                    if (minimum < shortestDistance) {
                        shortestDistance = minimum;
                        toAdd = currentStore;
                    }
                }
            }
            toStore.add(toAdd);
        }

        int toStoreLength = toStore.size();
        int[] toReturn = new int[toStoreLength];
        for (int i = 0; i < toStoreLength; i++) {
            toReturn[i] = toStore.get(i).intValue();
        }

        return toReturn;
    }
}
