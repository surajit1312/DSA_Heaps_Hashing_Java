package hashing.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * GeeksForGeeks: Find missing in second array
 * 
 * Link: https://www.geeksforgeeks.org/problems/in-first-but-second5423/1
 * 
 * TC: O(N + M)
 * SC: O(M)
 * 
 */
public class P5_Find_Missing_Number_In_Second_Array {
    public static void main(String[] args) {
        int N = 6, M = 5;
        long[] A = { 1, 2, 3, 4, 5, 10 };
        long[] B = { 2, 3, 1, 0, 5 };
        ArrayList<Long> missingList = findMissing(A, B, N, M);
        System.out.println("Missing numbers in second array are : " + missingList);
    }

    private static ArrayList<Long> findMissing(long A[], long B[], int N, int M) {
        ArrayList<Long> missingList = new ArrayList<Long>();
        Set<Long> set = new HashSet<Long>();
        for (Long it : B) {
            set.add(it);
        }
        for (Long it : A) {
            if (!set.contains(it)) {
                missingList.add(it);
            }
        }
        return missingList;
    }
}
