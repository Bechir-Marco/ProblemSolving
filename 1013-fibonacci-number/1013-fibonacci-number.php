class Solution {

    /**
     * @param Integer $n
     * @return Integer
     */
       function fib($n) {
         
        //   if ($n==0) return 0;
        //   if ($n== 1) return 1;
        //   $a=0; $b=1;
        //   for ($i=2;$i<=$n;$i++): 
        //   $temp=$a+$b;
        //   $a=$b;
        //   $b=$temp;
        //   endfor;
        //  return $b;

          
    if ($n == 0) return 0;
    if ($n == 1) return 1;
    return $this->fib($n - 1) + $this->fib($n - 2);

    }
      
}