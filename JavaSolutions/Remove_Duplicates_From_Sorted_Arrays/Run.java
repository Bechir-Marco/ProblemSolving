package Remove_Duplicates_From_Sorted_Arrays;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Sol sol = new Sol();
        int [] arr = {0,1,1,1,2,2,3,4,4};
        sol.removeDuplicates(arr);
        System.out.println("le tab est " + Arrays.toString(arr));
    }
}
