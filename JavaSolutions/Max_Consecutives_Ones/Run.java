package Max_Consecutives_Ones;

public class Run {
    public static void main(String[] args) {
        SOl sol = new SOl();
        int [] arr = {1,0,1,1,0,1};

        System.out.println("Max Consecutives One is :"+sol.findMaxConsecutiveOnes(arr));
    }
}
