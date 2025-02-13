class Solution {

    /**
     * @param String $word
     * @return Boolean
     */
  function detectCapitalUse($word) {
  
    $word = preg_replace('/\W/', '', $word);
    if (preg_match('/^[A-Z][a-z]*$/',$word) || preg_match('/^[A-Z]*$/',$word) || preg_match('/^[a-z]*$/',$word)) return true;
    else return false;
    }
}