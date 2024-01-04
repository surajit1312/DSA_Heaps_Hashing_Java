package hashing.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * CodingNinjas: Subarray with given sum
 * 
 * Link:
 * https://www.codingninjas.com/studio/problems/subarray-with-given-sum_842487
 * 
 * TC: O(n)
 * SC: O(n)
 * 
 */
public class P1_SubArray_With_Given_Sum {
    public static void main(String[] args) {
        int[] arr = { 1, 0 };
        int s = 0;
        int[] indices = subarraySum(arr, s);
        System.out.println(
                "Indices of sub-array with given sum " + s + " in array " + Arrays.toString(arr) + " is : "
                        + Arrays.toString(indices));
    }

    private static int[] subarraySum(int[] arr, long sum) {
        int[] indices = { -1, -1 };
        Long currentSum = 0L;
        Map<Long, Long> map = new HashMap<Long, Long>();
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum - sum == 0) {
                indices[0] = 0;
                indices[1] = i;
                break;
            }
            if (map.containsKey(currentSum - sum)) {
                indices[0] = (int) (map.get(currentSum - sum) + 1);
                indices[1] = i;
                break;
            }
            map.put(currentSum, (long) i);
        }
        return indices;
    }
}
