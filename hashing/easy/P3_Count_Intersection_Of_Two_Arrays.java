package hashing.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * GeeksForGeeks: Intersection of two arrays
 * 
 * Link: https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1
 * 
 * TC: O(n + m)
 * SC: O(min(n, m))
 * 
 */
public class P3_Count_Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        int n = 6, m = 5;
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int[] b = { 3, 4, 5, 6, 7 };
        int countIntersection = numberofElementsInIntersection(a, b, n, m);
        System.out
                .println("Intersection count of two arrays a: " + Arrays.toString(a) + " and b : " + Arrays.toString(b)
                        + " is : " + countIntersection);
    }

    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    private static int numberofElementsInIntersection(int a[], int b[], int n, int m) {
        int[] smallestArr = n > m ? b : a;
        int[] largestArr = n > m ? a : b;

        Set<Integer> set = new HashSet<Integer>();
        for (Integer it : smallestArr) {
            set.add(it);
        }
        int count = 0;
        for (Integer it : largestArr) {
            if (set.contains(it)) {
                count++;
                set.remove(it);
            }
        }
        return count;
    }
}
