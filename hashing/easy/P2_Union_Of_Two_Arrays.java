package hashing.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * GeeksForGeeks: Union of two arrays
 * 
 * Link: https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
 * 
 * TC: O(n + m)
 * SC: O(n + m)
 * 
 */
public class P2_Union_Of_Two_Arrays {
    public static void main(String[] args) {
        int[] a = { 85, 25, 1, 32, 54, 6 };
        int n = 6;
        int[] b = { 85, 2 };
        int m = 2;
        int countUnion = doUnion(a, n, b, m);
        System.out.println("Union count of two arrays a: " + Arrays.toString(a) + " and b : " + Arrays.toString(b)
                + " is : " + countUnion);
    }

    private static int doUnion(int a[], int n, int b[], int m) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer it : a) {
            set.add(it);
        }
        for (Integer it : b) {
            set.add(it);
        }
        return set.size();
    }
}
