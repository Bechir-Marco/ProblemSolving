package Rotate_String;

import java.util.ArrayList;

public class Sol {
    public boolean rotateString(String s, String goal) {
        ArrayList<Character> arr = new ArrayList<>();
        StringBuilder strToAppend= new StringBuilder("");
        for (char c: s.toCharArray()
             ) { arr.add(c);

        }
        for (int i =0; i<goal.length();i++){
            char c = arr.remove(0);
            arr.add(c);
            for (char q: arr
                 ) { strToAppend.append(q);

            }
            if (strToAppend.toString().equals(goal))
                return true;
            strToAppend = new StringBuilder("");
        }
        return false;
    }
}
