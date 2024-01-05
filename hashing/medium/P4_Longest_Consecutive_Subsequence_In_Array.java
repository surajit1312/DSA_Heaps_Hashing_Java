package hashing.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * CodingNinjas: Longest Successive Elements
 * 
 * Link:
 * https://www.codingninjas.com/studio/problems/longest-successive-elements_6811740
 * 
 * TC: O(n) + O(n) + O(2n) = O(4n) ~ O(n)
 * SC: O(n)
 * 
 */
public class P4_Longest_Consecutive_Subsequence_In_Array {
    public static void main(String[] args) {
        int[] arr = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        int count = longestSuccessiveElements(arr);
        System.out.println("Longest consecutive subsequence in array " + Arrays.toString(arr) + " is: " + count);
    }

    private static int longestSuccessiveElements(int[] a) {
        Set<Integer> set = new HashSet<Integer>();
        int longestCount = 1;
        for (Integer it : a) {
            set.add(it);
        }
        for (Integer it : set) {
            if (!set.contains(it - 1)) {
                int currentCount = 1;
                int currentSmallest = it;
                while (set.contains(currentSmallest + 1)) {
                    currentSmallest++;
                    currentCount++;
                }
                longestCount = Math.max(longestCount, currentCount);
            }
        }
        return longestCount;
    }

}
