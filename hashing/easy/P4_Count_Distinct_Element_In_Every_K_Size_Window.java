package hashing.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * CodingNinjas: Count Distinct Element in Every K Size Window
 * 
 * Link:
 * https://www.codingninjas.com/studio/problems/count-distinct-element-in-every-k-size-window_920336
 * 
 * TC: O(n)
 * SC: O(k)
 * 
 */
public class P4_Count_Distinct_Element_In_Every_K_Size_Window {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 4, 2, 3 };
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (Integer it : nums) {
            arr.add(it);
        }
        int k = 3;
        ArrayList<Integer> countDistinct = countDistinctElements(arr, k);
        System.out.println(
                "Count of distinct elements in every " + k + " size window in " + arr + " is : " + countDistinct);
    }

    private static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> countDistinct = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < k; i++) {
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        }
        countDistinct.add(map.size());
        for (int i = k; i < arr.size(); i++) {
            // removing the element from previous window slice
            if (map.get(arr.get(i - k)) == 1) {
                map.remove(arr.get(i - k));
            } else {
                map.put(arr.get(i - k), map.get(arr.get(i - k)) - 1);
            }
            // adding the new/last element of new window slice
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
            countDistinct.add(map.size());
        }
        return countDistinct;
    }

}
