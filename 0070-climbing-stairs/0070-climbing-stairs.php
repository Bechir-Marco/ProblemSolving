class Solution {

    /**
     * @param Integer $n
     * @return Integer
     */
    function climbStairs($n) {
       
        if ($n==1) return 1;
        if ($n==2) return 2;
        $map= array_fill(0,$n,0);
        $map[1] = 1;
        $map [2] = 2;
        for ($i=3 ;$i<=$n;$i++): 
        $map[$i] = $map[$i-1] + $map[$i-2];
        endfor;
        return $map[$n];
    }
}