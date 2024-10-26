package SquaresOfSortedArrays;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Sol sol = new Sol();
        int[] arr = {-7,-3,0,2,3,6};
        sol.sortedSquares(arr);
        System.out.println("tabl : "+Arrays.toString(arr));
    }
}
