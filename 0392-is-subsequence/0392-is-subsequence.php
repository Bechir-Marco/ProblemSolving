class Solution {

    /**
     * @param String $s
     * @param String $t
     * @return Boolean
     */
  
function isSubsequence($sub, $s) {
  if ($sub =='') return true;
  $pattern = '/' . implode('.*',str_split($sub))  . '/';
 return preg_match($pattern,$s)===1;
}
    
}