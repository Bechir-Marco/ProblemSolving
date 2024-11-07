package Missing_Number;

import java.util.Arrays;
import java.util.HashMap;

public class Sol {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum=0;
        for (int i : nums) {
            actualSum+=i;
        }
        return expectedSum -actualSum;
    }
}
