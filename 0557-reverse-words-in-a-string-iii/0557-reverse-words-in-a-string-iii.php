class Solution {

    /**
     * @param String $s
     * @return String
     */
function reverseWords($s) {
    
    $words = preg_split('/\s+/', $s);
    print_r($words);
    
    foreach ($words as &$word) {
        
            $word = strrev($word); 
        
    }
    return implode(' ', $words);
}
}