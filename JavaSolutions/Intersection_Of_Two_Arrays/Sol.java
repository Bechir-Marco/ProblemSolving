package Intersection_Of_Two_Arrays;

import java.util.*;

public class Sol {
    public int[] intersection(int[] nums1, int[] nums2) {


        HashSet<Integer> firstSet = new HashSet<>();
        HashSet<Integer> secondSet = new HashSet<>();

        for (int n : nums1
        ) {
            firstSet.add(n);

        }
        for (int n : nums2
        ) {
            if (firstSet.contains(n)) {
                secondSet.add(n);
            }


        }
 int [] result = new int [secondSet.size()];
        int index=0;
        for (int n: secondSet
             ) {
            result[index]=n;
            index++;
        }
        return  result;
    }
}
