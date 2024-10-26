package SquaresOfSortedArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length ; int index = n- 1 ; int left =0; int right =n-1; int rightVal, leftVal;
       int[] res = new int[n];
       while (index>=0){
           leftVal = nums[left]*nums[left];
           rightVal = nums[right]*nums[right];
           if (leftVal>rightVal){
               res[index--]=leftVal;
               left++;
           }
           else {
               res[index--]=rightVal;
               right--;
           }
       }
       return res;
    }
}
