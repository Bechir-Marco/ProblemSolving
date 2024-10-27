package Max_Consecutives_Ones;

public class SOl {
    public int findMaxConsecutiveOnes(int[] nums) {
       int counter =0,max=0 , j=0,i=0;
        while (j<nums.length){
                        if (nums[j]!=1){

                            counter =0;
                            i=j+1;
                            j++;

                        }else {
                            counter ++;
                            j++;

                        }
                        max= Math.max(counter,max);
        }
            return max;
        }
    }

