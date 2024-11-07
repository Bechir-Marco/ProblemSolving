package First_Bad_Version;

public class Sol {
    boolean isBadVersion(int n) {
        if (n==4)
        return true;
        else return false;
    }
    public int firstBadVersion(int n) {
        int l =1;
        int r =n;

        while (l<r) {
            int mid = l + (r-l)/2;
            if (!isBadVersion(mid)) {
                l= mid+1    ;
            }else r=mid-1;
        }
        return l;
    }
}
