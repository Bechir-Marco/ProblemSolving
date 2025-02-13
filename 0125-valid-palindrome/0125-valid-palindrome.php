class Solution {

    /**
     * @param String $s
     * @return Boolean
     */
 function isPalindrome($s) {
        
        $news= strtolower($s);
        $pattern = '/[^a-z0-9]/';
        $news = preg_replace($pattern,'',$news);
        return  ($news === strrev($news));
        
    }
}