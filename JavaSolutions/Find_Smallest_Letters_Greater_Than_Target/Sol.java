package Find_Smallest_Letters_Greater_Than_Target;

public class Sol {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length ;
        int L =0;
        int R = n-1;
        if (letters[n-1]<= target || letters[0]>target) return letters[0];
        while (L+1 <R) {
            int Mid =L+ ((R-L)/2);
            if (letters[Mid] <=target) {
                L=Mid;
            }else {
                R=Mid;
            }
        }
        return letters[R];
    }
}
