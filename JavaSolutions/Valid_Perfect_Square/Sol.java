package Valid_Perfect_Square;

public class Sol {
    public boolean isPerfectSquare(int num) {
        int l =0 ;
        int r = num;
        if (num<2) return true ;
        while (l+1 <r) {
            int mid = l + (r-l)/2;
            if(l==mid) return true;
            if (mid > num/mid) {
                r= mid;
            } else l = mid;
        }
        return l*l ==num;
    }
}
