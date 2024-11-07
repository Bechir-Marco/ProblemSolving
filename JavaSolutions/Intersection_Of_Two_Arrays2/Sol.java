package Intersection_Of_Two_Arrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Sol {
    public int[] intersect(int[] nums1, int[] nums2) {


            int  i =0;
            int j =0;
            ArrayList<Integer> arr = new ArrayList<>();
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            while (i<nums1.length && j<nums2.length) {
                if (nums1[i]<nums2[j])
                    i++;
                else if (nums1[i]>nums2[j])
                    j++;
                else {arr.add(nums1[i]);
                    i++;j++;}
            }
            int [] result = new int [arr.size()];
            for (int k = 0; k < result.length ; k++) {
                result[k] = arr.get(k);
            }
            return  result;
        }
    }

