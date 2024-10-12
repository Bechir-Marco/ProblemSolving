package TwoSum;
import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Sol solution = new Sol();
        int[] nums = {2, 7,2, 11, 15,1,10};
        int target = 9;

        int[] result = solution.twoSum(nums, target);
        System.out.println("Tableau complet : [" + result[0] + ", " + result[1] + "]");

           }


}
