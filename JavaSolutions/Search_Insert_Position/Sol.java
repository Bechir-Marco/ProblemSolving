package Search_Insert_Position;

public class Sol {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int r = n -1;
        int l = 0;
        if (nums[l]>=target)return l;
        if (nums[r]<target)return n;
        while (l+1<r) {
            int mid = l + ((r-l+1)/2);
            if (nums[mid]==target)return mid;
            if (nums[mid]<target){
                l=mid;
            }else r=mid;

        }
        return r;
    }
}
