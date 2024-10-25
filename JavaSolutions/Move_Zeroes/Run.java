package Move_Zeroes;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Sol sol = new Sol();
        int[] arr = {0, 1,0,2, 3, 12};
        sol.moveZeroes(arr);

        System.out.println("nouveau tab est " + Arrays.toString(arr));
    }
}
