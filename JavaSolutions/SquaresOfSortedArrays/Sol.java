package SquaresOfSortedArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol {
    public int[] sortedSquares(int[] nums) {
        int[] arrSqr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arrSqr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arrSqr);
        return arrSqr;
    }
}
