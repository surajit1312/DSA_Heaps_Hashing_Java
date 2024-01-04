package hashing.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Count Distinct Elements in Array
 * 
 * TC: O(N)
 * SC: O(N)
 * 
 */
public class P1_Count_Distinct_Elements_Array {
    public static void main(String[] args) {
        int[] arr = { 15, 0, 7, 15, 0, 7, 9, 8 };
        int distinct = countDistinct(arr);
        System.out.println("Number of distinct elements in array " + Arrays.toString(arr) + " is : " + distinct);
    }

    private static int countDistinct(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size();
    }
}
