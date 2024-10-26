package Remove_Duplicates_From_Sorted_Arrays;

public class Sol {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[j + 1] = nums[i];
                j++;
            }
        }
        return j+1;
    }
}
