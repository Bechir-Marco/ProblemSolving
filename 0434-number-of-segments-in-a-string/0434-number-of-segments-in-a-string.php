class Solution {

    /**
     * @param String $s
     * @return Integer
     */
    function countSegments($s) {
     return preg_match_all('/\S+/',$s);
    }
}