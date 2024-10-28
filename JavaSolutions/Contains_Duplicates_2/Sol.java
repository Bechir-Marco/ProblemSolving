package Contains_Duplicates_2;

import java.util.HashMap;
import java.util.Map;

public class Sol {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();
        int j ;
        for (int i =0; i< nums.length; i++){
            if (map.containsKey(nums[i])) {
                j = map.get(nums[i]);
                if (Math.abs(i-j)<=k)
                    return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }


}
