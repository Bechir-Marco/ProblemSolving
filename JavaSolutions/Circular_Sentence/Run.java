package Circular_Sentence;

public class Run {
    public boolean isCircularSentence(String str) {
        char [] chars = str.toCharArray();
        int i =0;
        if (chars[i]!= chars[chars.length-1]) return false;
        for ( i =0; i<str.length(); i++) {
            if (chars[i] == ' '){
                if (chars[i-1]!=chars[i+1]) return false;
                else continue;
            }
        }
        return true;
    }
}
