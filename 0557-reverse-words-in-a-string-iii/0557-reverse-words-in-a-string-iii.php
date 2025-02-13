class Solution {

    /**
     * @param String $s
     * @return String
     */
function reverseWords($s) {
    
    $words = preg_split('/\s+/', $s);
    
    foreach ($words as &$word) {
        if (!preg_match('/^\s+$/', $word)) { 
            $word = strrev($word); 
        }
    }
    return implode(' ',$words);
  
}
}