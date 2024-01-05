package hashing.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * CodingNinjas: Longest Subarray With Sum K
 * 
 * Link:
 * https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505
 * 
 * TC: O(n)
 * SC: O(n)
 * 
 */
public class P2_Longest_Sub_Array_With_Sum_K {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 0, 1 };
        int k = 4;
        int longestSubArrayWithSumK = getLongestSubarray(nums, k);
        System.out.println("Longest Sub-Array with sum " + k + " in array " + Arrays.toString(nums) + " is : "
                + longestSubArrayWithSumK);
    }

    public static int getLongestSubarray(int[] nums, int k) {
        int currentSum = 0;
        int longestSubArrayLength = 0;
        int start = -1;
        int end = -1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum == k) {
                start = 0;
                end = i;
                longestSubArrayLength = Math.max(longestSubArrayLength, end - start + 1);
            }
            if (map.containsKey(currentSum - k)) {
                start = map.get(currentSum - k) + 1;
                end = i;
                longestSubArrayLength = Math.max(longestSubArrayLength, end - start + 1);
            }
            if (!map.containsKey(currentSum))
                map.put(currentSum, i);
        }
        if (end == -1) {
            return 0;
        }
        return longestSubArrayLength;
    }
}
