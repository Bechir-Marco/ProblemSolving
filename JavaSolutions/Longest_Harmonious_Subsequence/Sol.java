package Longest_Harmonious_Subsequence;

import java.util.Arrays;

public class Sol {
    public int findLHS(int[] nums) {
          int num=0,max=0;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if (hasSuccesor(nums,nums[i])){
                num = successorAndItselfRepetition(nums,nums[i]);

            }
            max=Math.max(num,max);

        }
        return max;
    }
      static  int successorAndItselfRepetition(int[] nums,int k){
        int rep =0;
        for (int i= 0; i< nums.length;i++){
            if (nums[i]==k || nums[i]==k+1) rep ++;
        }
        return rep;
    }
    static boolean hasSuccesor (int [] nums,int k){

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==k+1) return true;
        }
        return false;
    }
}
