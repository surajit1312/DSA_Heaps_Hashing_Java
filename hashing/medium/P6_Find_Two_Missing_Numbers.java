package hashing.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * CodingNinjas: Find Two Missing Numbers
 * 
 * Link:
 * https://www.codingninjas.com/studio/problems/find-two-missing-numbers_1214700
 * 
 * TC: O(n + n - 2) = O(2n - 2) ~ O(n)
 * SC: O(n - 2) ~ O(n)
 * 
 */
public class P6_Find_Two_Missing_Numbers {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 6, 5 };
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (Integer it : nums) {
            arr.add(it);
        }
        ArrayList<Integer> missingList = findMissingNumbers(arr, n);
        System.out.println("Two missing numbers in array " + arr + " are : " + missingList);
    }

    public static ArrayList<Integer> findMissingNumbers(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> missingList = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for (Integer it : arr) {
            set.add(it);
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missingList.add(i);
            }
        }
        return missingList;
    }
}
