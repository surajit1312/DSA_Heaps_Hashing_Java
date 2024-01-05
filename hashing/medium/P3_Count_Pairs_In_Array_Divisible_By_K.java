package hashing.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * GeeksForGeeks: Count pairs in array divisible by K
 * 
 * Link:
 * https://www.geeksforgeeks.org/problems/count-pairs-in-array-divisible-by-k/1
 * 
 * TC: O(n)
 * SC: O(n)
 * 
 */
public class P3_Count_Pairs_In_Array_Divisible_By_K {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 7, 5, 3 };
        int n = 6;
        int k = 4;
        long countPairs = countKdivPairs(arr, n, k);
        System.out.println("Number of pairs in array " + Arrays.toString(arr) + " which are divisible by " + k
                + " is: " + countPairs);
    }

    private static long countKdivPairs(int arr[], int n, int k) {
        long count = 0L;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int rem = arr[i] % k;
            if (rem != 0) {
                count += map.getOrDefault(k - rem, 0);
            } else {
                count += map.getOrDefault(0, 0);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}
