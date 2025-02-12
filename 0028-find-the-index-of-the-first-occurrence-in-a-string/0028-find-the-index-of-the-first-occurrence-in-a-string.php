class Solution {

    /**
     * @param String $haystack
     * @param String $needle
     * @return Integer
     */
 function strStr($haystack, $needle) {
  $needle= "/" . preg_quote($needle,'/') . "/";
   if (preg_match($needle,$haystack,$matches,PREG_OFFSET_CAPTURE))
  return $matches[0][1];
else return -1;
    }
}