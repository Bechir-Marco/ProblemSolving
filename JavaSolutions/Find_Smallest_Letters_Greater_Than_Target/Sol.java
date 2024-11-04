package Find_Smallest_Letters_Greater_Than_Target;

public class Sol {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters){
            if (c >target) {
                return c;
            }
        }
        return letters[0];
    }
}
