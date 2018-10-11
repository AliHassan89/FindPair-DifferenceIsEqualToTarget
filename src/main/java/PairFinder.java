/*

Given a sorted array and a number n, find if there exists a pair of elements in the array whose difference is n.
Examples:
Input: arr[] = {5, 20, 3, 2, 50, 80}, n = 78
Output: Pair Found: (2, 80)

Input: arr[] = {90, 70, 20, 80, 50}, n = 45
Output: No Such Pair

 */

package main.java;

import java.util.ArrayList;

public class PairFinder {

    public int diffPossible(ArrayList<Integer> list, int target) {
        if (list.isEmpty() || list.size() == 1)
            return 0;

        int i = 0;
        int j = 1;
        int len = list.size();
        int diff;

        while (i < len && j<len) {
            diff = list.get(j) - list.get(i);
            if (i != j && diff == target)
                return 1;

            if (diff < target) {
                ++j;
            }

            else
                ++i;
        }

        return 0;
    }

}
