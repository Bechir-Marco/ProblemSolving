class Solution {

    /**
     * @param String $s
     * @return Boolean
     */
     
 function repeatedSubstringPattern($s) {
   $pattern = '/^(.+)\\1+$/';
   return preg_match($pattern,$s)===1;
}
}