class Solution {

    /**
     * @param Integer $n
     * @return Integer
     */
    function tribonacci($n) {
        $arr=[];
        $arr[0]=0;
        $arr[1]=1;
        $arr[2]=1;
        for($i=3;$i<=$n;$i++): 
        $arr[$i]= $arr[$i-3]+ $arr[$i-2] + $arr[$i-1];

        endfor;
        return $arr[$n];
    }
}