class Solution {

    /**
     * @param String $s
     * @param String $t
     * @return Boolean
     */
    function isAnagram($s, $t) { 
     $s = strtolower($s);
     $t = strtolower($t);
     $s= preg_replace('/[^a-z0-9]/','',$s);
     $t=preg_replace('/[^a-z0-9]/','',$t);
     $arr1 = str_split($s);
     $arr2 = str_split($t);
     sort($arr1);
     sort($arr2);
     return implode('',$arr1) == implode('',$arr2);
    }
}