package TwoSum_Input_Array_Is_Sorted;
import java.util.Arrays;
public class Run {
    public static void main(String[] args) {

        Sol sol = new Sol();
        int [] arr=  {2,7,11,15};
        int target = 9;
        arr = sol.twoSum(arr,target);
        System.out.println(" le tableau est : "+ Arrays.toString(arr));

    }
}
