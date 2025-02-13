class Solution {

    /**
     * @param String $word
     * @return Boolean
     */
  function detectCapitalUse($word) {
    return preg_match('/^[A-Z]+$|^[a-z]+$|^[A-Z][a-z]+$/', $word);
}
}