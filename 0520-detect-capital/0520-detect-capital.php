class Solution {

    /**
     * @param String $word
     * @return Boolean
     */
  function detectCapitalUse($word) {
   $word = preg_replace('/\W/','',$word);
    $uppercases=0;
    $lowercases=0;
        foreach($arr= str_split($word,1) as $w): 
        if($w >='A'&& $w<='Z')  $uppercases ++;
        if($w >='a'&& $w<='z') $lowercases ++;     
        endforeach;
        if ($word[0] >='A'&& $word[0]<='Z' && $lowercases==strlen($word)-1 || $uppercases==strlen($word) || $lowercases==strlen($word)) return true;
        else return false;
    }
}