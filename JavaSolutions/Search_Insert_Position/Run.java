package Search_Insert_Position;

public class Run {
    public static void main(String[] args) {
        Sol sol = new Sol();
        int [] nums = {1,3,5,6} ;
        int target = 7;
        System.out.println("tab "+ sol.searchInsert(nums,target));
    }
}
