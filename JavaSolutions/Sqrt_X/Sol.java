package Sqrt_X;

public class Sol {
    public int mySqrt(int x) {
       int res =x;
       int l=0;
       int r = x;
       int mid=0;
       if (x==0 || x==1) return x;
       while (l+1<r) {

           mid = l+ (r-l)/2;
           if (l ==mid) return l;
           if (mid >x/mid){
               r = mid;
           }
           else l = mid;
       }
       return l;
    }
}
