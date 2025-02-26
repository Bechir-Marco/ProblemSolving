class Solution {

    /**
     * @param Integer[] $cost
     * @return Integer
     */
  function minCostClimbingStairs($cost) {
  
    
    $dp = array_fill(0,count($cost)+1,0);
    $n = count($dp);

    if ($n <2 ) return 0;
        $dp[0] = 0;
        $dp[1] = 0;
        for($i=2;$i<=$n;$i++): 
         $dp[$i]= min($cost[$i-2] + $dp[$i-2], $cost[$i-1]+$dp[$i-1]);
        endfor;
        print_r($dp[$i]);
        return $dp[$n-1];
        
    }
}