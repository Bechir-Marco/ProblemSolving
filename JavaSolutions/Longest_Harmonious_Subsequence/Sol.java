package Longest_Harmonious_Subsequence;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sol {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> mapToCOunt = new HashMap<>();
        for (int num : nums) {
            mapToCOunt.put(num, mapToCOunt.getOrDefault(num, 0) + 1);
        }
        int max =0;
        for (int n : mapToCOunt.keySet()) {
            if (mapToCOunt.containsKey(n+1))
            max = Math.max(mapToCOunt.get(n+1)+mapToCOunt.get(n),max);
        }
        return max;
    }
}
