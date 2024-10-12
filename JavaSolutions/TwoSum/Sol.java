package TwoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Sol {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sums.put(nums[i], i);
        }

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (sums.containsKey(complement) && sums.get(complement) != i) {
                result[0] = i;
                result[1] = sums.get(complement);
                break;
            }
        }

        return result;
    }

}
